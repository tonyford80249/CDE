
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui;

import org.apache.log4j.Logger;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cdoe.services.IChangeBillingManager;
import com.cdoe.ui.form.AuditEqualForm;
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
@Controller
@RequestMapping("/secure/ChangeELPA")
public class ChangeELPAController {

	private static final Logger logger = Logger.getLogger(ChangeELPAController.class);
	
	@Autowired
	private IChangeBillingManager changeBillingManager;
	
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
		AuditEqualForm form = changeBillingManager.setupForm();
    	model.addAttribute("auditEqualForm", form);
		return ".ChangeELPA-index";
    }
	
}