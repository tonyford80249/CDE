
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
import com.cdoe.services.IChangeBillingManager;
import com.cdoe.biz.model.AuditEqual;
import com.cdoe.ui.form.AuditEqualForm;

@Controller
@RequestMapping("/secure/ChangeBilling")
public class ChangeBillingController {

	private static final Logger logger = Logger.getLogger(ChangeBillingController.class);
	
	@Autowired
	private IChangeBillingManager changeBillingManager;
	
	@Autowired
	private Validator auditEqualValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	AuditEqualForm form = changeBillingManager.setupForm();
    	model.addAttribute("auditEqualForm", form);
		return ".ChangeBilling-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute AuditEqualForm auditEqualForm, BindingResult result, HttpServletRequest request) {
    	auditEqualValidator.validate(auditEqualForm, result);
		if (result.hasErrors()) {
			return ".ChangeBilling-index";
		}
		changeBillingManager.saveOrUpdate(auditEqualForm);
		model.addAttribute("saved", true);
		return ".ChangeBilling-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	AuditEqualForm form = changeBillingManager.setupForm(id);
    	model.addAttribute("auditEqualForm", form);
		return ".ChangeBilling-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	changeBillingManager.delete(AuditEqual.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<AuditEqual> auditEquals = changeBillingManager.findAll(AuditEqual.class);
    	model.addAttribute("auditEquals", auditEquals);
		return ".ChangeBilling-list";
    }
	
}