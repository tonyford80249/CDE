
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.ICommentsManager;
import com.cdoe.biz.ICommentsDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.CommentInfoForm;

public class CommentsManager extends BaseManager implements ICommentsManager {

	private static final Logger logger = Logger.getLogger(CommentsManager.class);
	
	private ICommentsDAO commentsDAO;
	
	public void saveOrUpdate(CommentInfoForm form) {
		long id = form.getId();
		CommentInfo obj = findById(CommentInfo.class, id); 
		if (obj == null) {
			obj = new CommentInfo();
		}
		obj.setEnteredDate(form.getEnteredDate());
		obj.setEnteredBy(form.getEnteredBy());
		obj.setActive(form.getActive());
		obj.setNote(form.getNote());
		saveOrUpdate(obj);
	}
	
	public CommentInfoForm setupForm() {
		CommentInfoForm form = new CommentInfoForm();
		return form;
	}
	
	public CommentInfoForm setupForm(long id) {
		CommentInfo obj = findById(CommentInfo.class, id); 
		
		CommentInfoForm form = new CommentInfoForm();
		form.setId(obj.getId());
		form.setEnteredDate(obj.getEnteredDate());
		form.setEnteredBy(obj.getEnteredBy());
		form.setActive(obj.getActive());
		form.setNote(obj.getNote());
		return form;
	}
	
	public void setCommentsDAO(ICommentsDAO commentsDAO) {
		this.commentsDAO = commentsDAO;
	}
	
}
