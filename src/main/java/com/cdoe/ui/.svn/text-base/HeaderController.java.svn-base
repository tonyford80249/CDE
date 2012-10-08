
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
import com.cdoe.services.IHeaderManager;
import com.cdoe.biz.model.VHeader;
import com.cdoe.ui.form.VHeaderForm;

@Controller
@RequestMapping("/secure/Header")
public class HeaderController {

	private static final Logger logger = Logger.getLogger(HeaderController.class);
	
	@Autowired
	private IHeaderManager headerManager;
	
	@Autowired
	private Validator vHeaderValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	VHeaderForm form = headerManager.setupForm();
    	model.addAttribute("vHeaderForm", form);
		return ".Header-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute VHeaderForm vHeaderForm, BindingResult result, HttpServletRequest request) {
    	vHeaderValidator.validate(vHeaderForm, result);
		if (result.hasErrors()) {
			return ".Header-index";
		}
		headerManager.saveOrUpdate(vHeaderForm);
		model.addAttribute("saved", true);
		return ".Header-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	VHeaderForm form = headerManager.setupForm(id);
    	model.addAttribute("vHeaderForm", form);
		return ".Header-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	headerManager.delete(VHeader.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<VHeader> vHeaders = headerManager.findAll(VHeader.class);
    	model.addAttribute("vHeaders", vHeaders);
		return ".Header-list";
    }
	
}