
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
import com.cdoe.services.IAudSumUpdateManager;
import com.cdoe.biz.model.AuditEqual;
import com.cdoe.ui.form.AuditEqualForm;

@Controller
@RequestMapping("/secure/AudSumUpdate")
public class AudSumUpdateController {

	private static final Logger logger = Logger.getLogger(AudSumUpdateController.class);
	
	@Autowired
	private IAudSumUpdateManager audSumUpdateManager;
	
	@Autowired
	private Validator auditEqualValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	AuditEqualForm form = audSumUpdateManager.setupForm();
    	model.addAttribute("auditEqualForm", form);
		return ".AudSumUpdate-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute AuditEqualForm auditEqualForm, BindingResult result, HttpServletRequest request) {
    	auditEqualValidator.validate(auditEqualForm, result);
		if (result.hasErrors()) {
			return ".AudSumUpdate-index";
		}
		audSumUpdateManager.saveOrUpdate(auditEqualForm);
		model.addAttribute("saved", true);
		return ".AudSumUpdate-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	AuditEqualForm form = audSumUpdateManager.setupForm(id);
    	model.addAttribute("auditEqualForm", form);
		return ".AudSumUpdate-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	audSumUpdateManager.delete(AuditEqual.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<AuditEqual> auditEquals = audSumUpdateManager.findAll(AuditEqual.class);
    	model.addAttribute("auditEquals", auditEquals);
		return ".AudSumUpdate-list";
    }
	
}