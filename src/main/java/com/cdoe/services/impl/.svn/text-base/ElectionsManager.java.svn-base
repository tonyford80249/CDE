
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IElectionsManager;
import com.cdoe.biz.IElectionsDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.ElectionsDetailForm;

public class ElectionsManager extends BaseManager implements IElectionsManager {

	private static final Logger logger = Logger.getLogger(ElectionsManager.class);
	
	private IElectionsDAO electionsDAO;
	
	public void saveOrUpdate(ElectionsDetailForm form) {
		long id = form.getId();
		ElectionsDetail obj = findById(ElectionsDetail.class, id); 
		if (obj == null) {
			obj = new ElectionsDetail();
		}
		obj.setDistrictCode(form.getDistrictCode());
		obj.setElectionType(form.getElectionType());
		obj.setElectionHeldStatus(form.getElectionHeldStatus());
		obj.setFor0(form.getFor0());
		obj.setAgainst(form.getAgainst());
		saveOrUpdate(obj);
	}
	
	public ElectionsDetailForm setupForm() {
		ElectionsDetailForm form = new ElectionsDetailForm();
		return form;
	}
	
	public ElectionsDetailForm setupForm(long id) {
		ElectionsDetail obj = findById(ElectionsDetail.class, id); 
		
		ElectionsDetailForm form = new ElectionsDetailForm();
		form.setId(obj.getId());
		form.setDistrictCode(obj.getDistrictCode());
		form.setElectionType(obj.getElectionType());
		form.setElectionHeldStatus(obj.getElectionHeldStatus());
		form.setFor0(obj.getFor0());
		form.setAgainst(obj.getAgainst());
		return form;
	}
	
	public void setElectionsDAO(IElectionsDAO electionsDAO) {
		this.electionsDAO = electionsDAO;
	}
	
}
