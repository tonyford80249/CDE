
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
import com.cdoe.services.IDisplayAdjustmentManager;
import com.cdoe.biz.model.StateEqualbacked;
import com.cdoe.ui.form.StateEqualForm;

@Controller
@RequestMapping("/secure/DisplayAdjustment")
public class DisplayAdjustmentController {

	private static final Logger logger = Logger.getLogger(DisplayAdjustmentController.class);
	
	@Autowired
	private IDisplayAdjustmentManager displayAdjustmentManager;
	
	@Autowired
	private Validator stateEqualValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	StateEqualForm form = displayAdjustmentManager.setupForm();
    	model.addAttribute("stateEqualForm", form);
		return ".DisplayAdjustment-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute StateEqualForm stateEqualForm, BindingResult result, HttpServletRequest request) {
    	stateEqualValidator.validate(stateEqualForm, result);
		if (result.hasErrors()) {
			return ".DisplayAdjustment-index";
		}
		displayAdjustmentManager.saveOrUpdate(stateEqualForm);
		model.addAttribute("saved", true);
		return ".DisplayAdjustment-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	StateEqualForm form = displayAdjustmentManager.setupForm(id);
    	model.addAttribute("stateEqualForm", form);
		return ".DisplayAdjustment-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	displayAdjustmentManager.delete(StateEqualbacked.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<StateEqualbacked> stateEquals = displayAdjustmentManager.findAll(StateEqualbacked.class);
    	model.addAttribute("stateEquals", stateEquals);
		return ".DisplayAdjustment-list";
    }
	
}