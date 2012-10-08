
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
import com.cdoe.services.IMillLevyOverrideWorksheetManager;
import com.cdoe.biz.model.VData;
import com.cdoe.ui.form.VDataForm;

@Controller
@RequestMapping("/secure/MillLevyOverrideWorksheet")
public class MillLevyOverrideWorksheetController {

	private static final Logger logger = Logger.getLogger(MillLevyOverrideWorksheetController.class);
	
	@Autowired
	private IMillLevyOverrideWorksheetManager millLevyOverrideWorksheetManager;
	
	@Autowired
	private Validator vDataValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	VDataForm form = millLevyOverrideWorksheetManager.setupForm();
    	model.addAttribute("vDataForm", form);
		return ".MillLevyOverrideWorksheet-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute VDataForm vDataForm, BindingResult result, HttpServletRequest request) {
    	vDataValidator.validate(vDataForm, result);
		if (result.hasErrors()) {
			return ".MillLevyOverrideWorksheet-index";
		}
		millLevyOverrideWorksheetManager.saveOrUpdate(vDataForm);
		model.addAttribute("saved", true);
		return ".MillLevyOverrideWorksheet-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	VDataForm form = millLevyOverrideWorksheetManager.setupForm(id);
    	model.addAttribute("vDataForm", form);
		return ".MillLevyOverrideWorksheet-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	millLevyOverrideWorksheetManager.delete(VData.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<VData> vDatas = millLevyOverrideWorksheetManager.findAll(VData.class);
    	model.addAttribute("vDatas", vDatas);
		return ".MillLevyOverrideWorksheet-list";
    }
	
}