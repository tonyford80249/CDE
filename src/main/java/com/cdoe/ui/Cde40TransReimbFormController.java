
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdoe.biz.model.Transportation;
import com.cdoe.services.ICapitalOutlayManager;
import com.cdoe.services.ICde40TransReimbFormManager;
import com.cdoe.ui.form.TransportationForm;
import com.cdoe.util.UserInfo;
import com.resqsoft.util.RequestUtils;

@Controller
@RequestMapping("/secure/Cde40TransReimbForm")
public class Cde40TransReimbFormController {
	private static final Logger logger = Logger.getLogger(Cde40TransReimbFormController.class);
	
	@Autowired
	private ICde40TransReimbFormManager cde40TransReimbFormManager;
	@Autowired
	private Validator cde40TransFormValidator;
	@Autowired
	private ICapitalOutlayManager capitalOutlayManager;

	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	UserInfo userInfo = (UserInfo) session.getAttribute("USER_INFO");
    	String districtCode = null;
    	//Need to account for adminUser also
		if (userInfo.isAdminUser()) {
			// For right now, we'll default to the first district
			// This needs to change to a drop-down for the admin user where they select
			// the district to work on
			districtCode = userInfo.getAllDistrictCodes().get(0);
		} else {
			districtCode = userInfo.getUsersDistricts().get(0);
		}
		TransportationForm form = cde40TransReimbFormManager.setupForm(districtCode);
		boolean isCapitalOutlayDistrict = capitalOutlayManager.isCapitalOutlayDistricts(form.getFiscalYear(), form.getDistrictNumber());
		form.setCapitalOutLay(isCapitalOutlayDistrict);
		form.setDistrictNumber(districtCode);
		String districtName = userInfo.lookupDistrict(districtCode);
		form.setDistrictName(districtName);
		model.addAttribute("transportationForm", form);
		return ".Cde40TransReimbForm-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute TransportationForm transportationForm, BindingResult result, HttpServletRequest request) {
    	
		cde40TransFormValidator.validate(transportationForm, result);
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			StringBuffer errorMessage = new StringBuffer("");
			for (ObjectError enError : errors) {
				logger.debug(enError.getDefaultMessage());
				logger.debug(enError.getCode());
				if (enError.getDefaultMessage().length() > 100)
				{
					errorMessage.append(enError.getDefaultMessage().substring(0,100) + "\n");
				} else
					errorMessage.append(enError.getDefaultMessage() + "\n");
			}
			transportationForm.setErrors(errorMessage.toString());
			return ".Cde40TransReimbForm-index";
		}
		cde40TransReimbFormManager.saveOrUpdate(transportationForm);
		model.addAttribute("saved", true);
		HttpSession session = request.getSession();
		session.setAttribute("preparerEmailId", transportationForm.getEmailPreparerCde40());
		session.setAttribute("preparerPhoneNos", transportationForm.getPhonePreparerCde40());
		session.setAttribute("preparerName", transportationForm.getNamePreparerCde40());
		logger.debug(transportationForm.getDistrictNumber());
		
		session.setAttribute("districtNos",transportationForm.getDistrictNumber());
		session.setAttribute("fiscalYear", transportationForm.getFiscalYear());
		if (transportationForm.getIsCapitalOutLay()) {
    		return "redirect:" + RequestUtils.getContextPath(request) + "/secure/CapitalOutlay";
    	}
		return ".Cde40TransReimbForm-index";
    }
    

    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<Transportation> transportations = cde40TransReimbFormManager.findAll(Transportation.class);
    	model.addAttribute("transportations", transportations);
		return ".Cde40TransReimbForm-list";
    }
	
}