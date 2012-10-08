
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
import com.cdoe.services.IAudTrackingManager;
import com.cdoe.biz.model.AuditFpc;
import com.cdoe.ui.form.AuditFpcForm;

@Controller
@RequestMapping("/secure/AuditTracking")
public class AuditTrackingController {

	private static final Logger logger = Logger.getLogger(AuditTrackingController.class);
	
	@Autowired
	private IAudTrackingManager audTrackingManager;
	
	@Autowired
	private Validator auditFpcValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	AuditFpcForm form = audTrackingManager.setupForm();
    	model.addAttribute("auditFpcForm", form);
		return ".AuditTracking-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute AuditFpcForm auditFpcForm, BindingResult result, HttpServletRequest request) {
    	auditFpcValidator.validate(auditFpcForm, result);
		if (result.hasErrors()) {
			return ".AuditTracking-index";
		}
		audTrackingManager.saveOrUpdate(auditFpcForm);
		model.addAttribute("saved", true);
		return ".AuditTracking-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	AuditFpcForm form = audTrackingManager.setupForm(id);
    	model.addAttribute("auditFpcForm", form);
		return ".AuditTracking-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	audTrackingManager.delete(AuditFpc.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<AuditFpc> auditFpcs = audTrackingManager.findAll(AuditFpc.class);
    	model.addAttribute("auditFpcs", auditFpcs);
		return ".AudTracking-list";
    }
	
}