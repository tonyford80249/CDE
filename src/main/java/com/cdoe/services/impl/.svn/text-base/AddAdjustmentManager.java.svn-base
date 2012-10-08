
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IAddAdjustmentManager;
import com.cdoe.biz.IAddAdjustmentDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.AdjustmentForm;

public class AddAdjustmentManager extends BaseManager implements IAddAdjustmentManager {

	private static final Logger logger = Logger.getLogger(AddAdjustmentManager.class);
	
	private IAddAdjustmentDAO addAdjustmentDAO;
	
	public void saveOrUpdate(AdjustmentForm form) {
		long id = form.getId();
		Adjustment obj = findById(Adjustment.class, id); 
		if (obj == null) {
			obj = new Adjustment();
		}
		obj.setAdjustmentNumber(form.getAdjustmentNumber());
		obj.setDistrictName(form.getDistrictName());
		obj.setDistrictCode(form.getDistrictCode());
		obj.setActive(form.getActive());
		obj.setBegFiscalYear(form.getBegFiscalYear());
		obj.setBegFiscalMonth(form.getBegFiscalMonth());
		obj.setEndFiscalYear(form.getEndFiscalYear());
		obj.setEndFiscalMonth(form.getEndFiscalMonth());
		obj.setFrequency(form.getFrequency());
		obj.setAdjustmentType(form.getAdjustmentType());
		obj.setAmount(form.getAmount());
		obj.setNotes(form.getNotes());
		saveOrUpdate(obj);
	}
	
	public AdjustmentForm setupForm() {
		AdjustmentForm form = new AdjustmentForm();
		List<District> districtList = findAll(District.class);
		for (District district : districtList) {
			form.getDistrictCodeList().add(district.getCode());
		}
		return form;
	}
	
	public AdjustmentForm setupForm(long id) {
		Adjustment obj = findById(Adjustment.class, id); 
		
		AdjustmentForm form = new AdjustmentForm();
		form.setId(obj.getId());
		form.setAdjustmentNumber(obj.getAdjustmentNumber());
		form.setDistrictName(obj.getDistrictName());
		form.setDistrictCode(obj.getDistrictCode());
		form.setActive(obj.getActive());
		form.setBegFiscalYear(obj.getBegFiscalYear());
		form.setBegFiscalMonth(obj.getBegFiscalMonth());
		form.setEndFiscalYear(obj.getEndFiscalYear());
		form.setEndFiscalMonth(obj.getEndFiscalMonth());
		form.setFrequency(obj.getFrequency());
		form.setAdjustmentType(obj.getAdjustmentType());
		form.setAmount(obj.getAmount());
		form.setNotes(obj.getNotes());
		List<District> districtList = findAll(District.class);
		for (District district : districtList) {
			form.getDistrictCodeList().add(district.getCode());
		}
		return form;
	}
	
	public void setAddAdjustmentDAO(IAddAdjustmentDAO addAdjustmentDAO) {
		this.addAdjustmentDAO = addAdjustmentDAO;
	}
	
}
