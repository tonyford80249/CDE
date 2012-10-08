
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.ISSOLoginManager;
import com.cdoe.biz.ISSOLoginDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.VHeaderForm;

public class SSOLoginManager extends BaseManager implements ISSOLoginManager {

	private static final Logger logger = Logger.getLogger(SSOLoginManager.class);
	
	private ISSOLoginDAO sSOLoginDAO;
	
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
	
	public void setsSOLoginDAO(ISSOLoginDAO sSOLoginDAO) {
		this.sSOLoginDAO = sSOLoginDAO;
	}
	
}
