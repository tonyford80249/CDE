
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
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdoe.biz.model.VHeader;
import com.cdoe.services.ISSOLoginManager;
import com.cdoe.ui.form.VHeaderForm;
import com.resqsoft.util.RequestUtils;

@Controller
@RequestMapping("/secure/SSOLogin")
public class SSOLoginController {

	private static final Logger logger = Logger.getLogger(SSOLoginController.class);
	
	@Autowired
	private ISSOLoginManager sSOLoginManager;
	
	
	@Autowired
	private Validator vHeaderValidator;
	
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model,  HttpServletRequest request ) {
		HttpSession session = request.getSession();
		session.invalidate();
    	VHeaderForm form = sSOLoginManager.setupForm();
    	model.addAttribute("vHeaderForm", form);
		return ".SSOLogin-index";
    }
    
	
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute VHeaderForm vHeaderForm, BindingResult result, HttpServletRequest request) {
    	vHeaderValidator.validate(vHeaderForm, result);
		if (result.hasErrors()) {
			model.addAttribute("vHeaderForm", vHeaderForm);
			//vHeaderForm.setError("Userid or password is invalid");
			return ".SSOLogin-index";
		}
		//sSOLoginManager.saveOrUpdate(vHeaderForm);
		HttpSession session = request.getSession();
		session.setAttribute("userName", vHeaderForm.getVUsername());
		model.addAttribute("saved", true);
		return ".LandingMenu-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	VHeaderForm form = sSOLoginManager.setupForm(id);
    	model.addAttribute("vHeaderForm", form);
		return ".SSOLogin-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	sSOLoginManager.delete(VHeader.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<VHeader> vHeaders = sSOLoginManager.findAll(VHeader.class);
    	model.addAttribute("vHeaders", vHeaders);
		return ".SSOLogin-list";
    }
	
}