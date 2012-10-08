
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
import com.cdoe.services.IUploadVariablesManager;
import com.cdoe.biz.model.StateEqualbacked;
import com.cdoe.ui.form.StateEqualForm;

@Controller
@RequestMapping("/secure/UploadVariables")
public class UploadVariablesController {

	private static final Logger logger = Logger.getLogger(UploadVariablesController.class);
	
	@Autowired
	private IUploadVariablesManager uploadVariablesManager;
	
	@Autowired
	private Validator stateEqualValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	StateEqualForm form = uploadVariablesManager.setupForm();
    	model.addAttribute("stateEqualForm", form);
		return ".UploadVariables-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute StateEqualForm stateEqualForm, BindingResult result, HttpServletRequest request) {
    	stateEqualValidator.validate(stateEqualForm, result);
		if (result.hasErrors()) {
			return ".UploadVariables-index";
		}
		uploadVariablesManager.saveOrUpdate(stateEqualForm);
		model.addAttribute("saved", true);
		return ".UploadVariables-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	StateEqualForm form = uploadVariablesManager.setupForm(id);
    	model.addAttribute("stateEqualForm", form);
		return ".UploadVariables-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	uploadVariablesManager.delete(StateEqualbacked.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<StateEqualbacked> stateEquals = uploadVariablesManager.findAll(StateEqualbacked.class);
    	model.addAttribute("stateEquals", stateEquals);
		return ".UploadVariables-list";
    }
	
}