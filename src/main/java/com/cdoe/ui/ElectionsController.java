
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui;

import org.apache.log4j.Logger;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import com.resqsoft.util.RequestUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cdoe.services.IElectionsManager;
import com.cdoe.biz.model.ElectionsDetail;
import com.cdoe.ui.form.ElectionsDetailForm;

@Controller
@RequestMapping("/secure/Elections")
public class ElectionsController {

	private static final Logger logger = Logger.getLogger(ElectionsController.class);
	
	@Autowired
	private IElectionsManager electionsManager;
	
	@Autowired
	private Validator electionsDetailValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	ElectionsDetailForm form = electionsManager.setupForm();
    	model.addAttribute("electionsDetailForm", form);
		return ".Elections-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute ElectionsDetailForm electionsDetailForm, BindingResult result, HttpServletRequest request) {
    	electionsDetailValidator.validate(electionsDetailForm, result);
		if (result.hasErrors()) {
			return ".Elections-index";
		}
		electionsManager.saveOrUpdate(electionsDetailForm);
		model.addAttribute("saved", true);
		return ".Elections-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	ElectionsDetailForm form = electionsManager.setupForm(id);
    	model.addAttribute("electionsDetailForm", form);
		return ".Elections-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	electionsManager.delete(ElectionsDetail.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<ElectionsDetail> electionsDetails = electionsManager.findAll(ElectionsDetail.class);
    	model.addAttribute("electionsDetails", electionsDetails);
		return ".Elections-list";
    }
	
}