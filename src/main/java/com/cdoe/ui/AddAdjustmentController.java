
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdoe.services.IAuditRepaymentAdjustmentManager;
import com.cdoe.services.IReferenceDataManager;
import com.cdoe.ui.form.AuditRepaymentAdjustmentForm;
import com.cdoe.ui.form.OtherStateShareAdjustmentsForm;
import com.cdoe.ui.validator.AuditRepaymentAdjustmentValidator;
import com.cdoe.util.DateUtil;
import com.cdoe.util.UserInfo;

@Controller
@RequestMapping("/secure/AddAdjustment")
public class AddAdjustmentController {

	private static final Logger logger = Logger.getLogger(AddAdjustmentController.class);
	
	@Autowired
	private AuditRepaymentAdjustmentValidator auditRepaymentAdjustmentValidator;
	
	@Autowired
	private IAuditRepaymentAdjustmentManager auditRepaymentAdjustmentManager;
	@Autowired
	private IReferenceDataManager referenceDataManager;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model, HttpSession session) {
		AuditRepaymentAdjustmentForm auditForm = new AuditRepaymentAdjustmentForm();
		OtherStateShareAdjustmentsForm otherForm = new OtherStateShareAdjustmentsForm();
		initModelDropdowns(model, session);
		model.addAttribute("auditAdjustmentForm", auditForm);
		model.addAttribute("otherAdjustmentForm", otherForm);
		return ".AddAdjustment-index";
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute AuditRepaymentAdjustmentForm form, BindingResult result, HttpSession session) {
		auditRepaymentAdjustmentValidator.validate(form, result);
		if (result.hasErrors()) {
			return ".AddAdjustment-index";
		}
		auditRepaymentAdjustmentManager.saveOrUpdate(form);
		initModelDropdowns(model, session);
		model.addAttribute("saved", true);
		model.addAttribute("auditAdjustmentForm", form);
		return ".AddAdjustment-index";
    }
	
	private void initModelDropdowns(Model model, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute(UserInfo.USER_INFO_ATTR);
		model.addAttribute("districtCodeNameDropdownList", userInfo.getAllDistrictCodes());
		model.addAttribute("fiscalYearDropdownList", DateUtil.getShortYears(DateUtil.getCurrentFiscalYearShort(), 5));
		model.addAttribute("monthDropdownList", DateUtil.getFullMonthList(false));
		model.addAttribute("frequencyList", referenceDataManager.getAuditRepaymentAdjustmentFrequencies());
	}
    
}