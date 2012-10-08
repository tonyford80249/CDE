
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
import com.cdoe.services.ICommentsManager;
import com.cdoe.biz.model.CommentInfo;
import com.cdoe.ui.form.CommentInfoForm;

@Controller
@RequestMapping("/secure/Comments")
public class CommentsController {

	private static final Logger logger = Logger.getLogger(CommentsController.class);
	
	@Autowired
	private ICommentsManager commentsManager;
	
	@Autowired
	private Validator commentInfoValidator;
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
    	CommentInfoForm form = commentsManager.setupForm();
    	model.addAttribute("commentInfoForm", form);
		return ".Comments-index";
    }
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute CommentInfoForm commentInfoForm, BindingResult result, HttpServletRequest request) {
    	commentInfoValidator.validate(commentInfoForm, result);
		if (result.hasErrors()) {
			return ".Comments-index";
		}
		commentsManager.saveOrUpdate(commentInfoForm);
		model.addAttribute("saved", true);
		return ".Comments-index";
    }
    
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable long id) {
    	CommentInfoForm form = commentsManager.setupForm(id);
    	model.addAttribute("commentInfoForm", form);
		return ".Comments-index";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable long id, HttpServletRequest request) {
    	commentsManager.delete(CommentInfo.class, id);
		return "redirect:" + RequestUtils.getContextPath(request) + "/list";
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<CommentInfo> commentInfos = commentsManager.findAll(CommentInfo.class);
    	model.addAttribute("commentInfos", commentInfos);
		return ".Comments-list";
    }
	
}