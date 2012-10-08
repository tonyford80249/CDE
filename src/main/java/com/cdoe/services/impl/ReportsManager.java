
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IReportsManager;
import com.cdoe.biz.IReportsDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.VDataForm;

public class ReportsManager extends BaseManager implements IReportsManager {

	private static final Logger logger = Logger.getLogger(ReportsManager.class);
	
	private IReportsDAO reportsDAO;
	
	public void saveOrUpdate(VDataForm form) {
		long id = form.getId();
		VData obj = findById(VData.class, id); 
		if (obj == null) {
			obj = new VData();
		}
		obj.setVPage(form.getVPage());
		obj.setVTextstring(form.getVTextstring());
		obj.setVDate(form.getVDate());
		obj.setVNumber(form.getVNumber());
		saveOrUpdate(obj);
	}
	
	public VDataForm setupForm() {
		VDataForm form = new VDataForm();
		return form;
	}
	
	public VDataForm setupForm(long id) {
		VData obj = findById(VData.class, id); 
		
		VDataForm form = new VDataForm();
		form.setId(obj.getId());
		form.setVPage(obj.getVPage());
		form.setVTextstring(obj.getVTextstring());
		form.setVDate(obj.getVDate());
		form.setVNumber(obj.getVNumber());
		return form;
	}
	
	public void setReportsDAO(IReportsDAO reportsDAO) {
		this.reportsDAO = reportsDAO;
	}
	
}
