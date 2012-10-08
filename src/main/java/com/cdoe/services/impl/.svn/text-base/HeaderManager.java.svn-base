/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IHeaderManager;
import com.cdoe.biz.IHeaderDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.VHeaderForm;

public class HeaderManager extends BaseManager implements IHeaderManager {

	private static final Logger logger = Logger.getLogger(HeaderManager.class);
	
	private IHeaderDAO headerDAO;
	
	public void saveOrUpdate(VHeaderForm form) {
		long id = form.getId();
		VHeader obj = findById(VHeader.class, id); 
		if (obj == null) {
			obj = new VHeader();
		}
		obj.setVDate(form.getVDate());
		obj.setVUsername(form.getVUsername());
		saveOrUpdate(obj);
	}
	
	public VHeaderForm setupForm() {
		VHeaderForm form = new VHeaderForm();
		return form;
	}
	
	public VHeaderForm setupForm(long id) {
		VHeader obj = findById(VHeader.class, id); 
		
		VHeaderForm form = new VHeaderForm();
		form.setId(obj.getId());
		form.setVDate(obj.getVDate());
		form.setVUsername(obj.getVUsername());
		return form;
	}
	
	public void setHeaderDAO(IHeaderDAO headerDAO) {
		this.headerDAO = headerDAO;
	}
	
}
