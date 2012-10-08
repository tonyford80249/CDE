
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IMonthlyPaymentsManager;
import com.cdoe.biz.IMonthlyPaymentsDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.DistrictForm;

public class MonthlyPaymentsManager extends BaseManager implements IMonthlyPaymentsManager {

	private static final Logger logger = Logger.getLogger(MonthlyPaymentsManager.class);
	
	private IMonthlyPaymentsDAO monthlyPaymentsDAO;
	
	public void saveOrUpdate(DistrictForm form) {
		long id = form.getId();
		District obj = findById(District.class, id); 
		if (obj == null) {
			obj = new District();
		}
		obj.setCode(form.getCode());
		obj.setName(form.getName());
		obj.setYear(form.getYear());
		saveOrUpdate(obj);
	}
	
	public DistrictForm setupForm() {
		DistrictForm form = new DistrictForm();
		return form;
	}
	
	public DistrictForm setupForm(long id) {
		District obj = findById(District.class, id); 
		
		DistrictForm form = new DistrictForm();
		form.setId(obj.getId());
		form.setCode(obj.getCode());
		form.setName(obj.getName());
		form.setYear(obj.getYear());
		return form;
	}
	
	public void setMonthlyPaymentsDAO(IMonthlyPaymentsDAO monthlyPaymentsDAO) {
		this.monthlyPaymentsDAO = monthlyPaymentsDAO;
	}
	
}
