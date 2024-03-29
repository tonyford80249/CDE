
package com.cdoe.services.impl;

import org.apache.log4j.Logger;

import com.cdoe.biz.impl.AdjustmentStatusDAO;
import com.cdoe.biz.model.AuditSasidException;
import com.cdoe.services.IAdjustmentStatusManager;
import com.cdoe.ui.form.AuditSasidExceptionForm;

public class AdjustmentStatusManager extends BaseManager implements IAdjustmentStatusManager {

	private static final Logger logger = Logger.getLogger(AdjustmentStatusManager.class);
	
	private AdjustmentStatusDAO sEExceptionStep1AdjustmentsDAO;
	
	public void saveOrUpdate(AuditSasidExceptionForm form) {
		long id = form.getId();
		AuditSasidException obj = findById(AuditSasidException.class, id); 
		if (obj == null) {
			obj = new AuditSasidException();
		}
		obj.setAtRiskException(form.getAtRiskException());
		obj.setPupilException(form.getPupilException());
		obj.setPostSecondary(form.getPostSecondary());
		obj.setAdjustedFreeLunch(form.getAdjustedFreeLunch());
		obj.setAdjustedFundingCode(form.getAdjustedFundingCode());
		obj.setSasidException(form.getSasidException());
		obj.setParentDistrictResidence(form.getParentDistrictResidence());
		obj.setAttendanceCode(form.getAttendanceCode());
		obj.setStudOctFreeLunch(form.getStudOctFreeLunch());
		obj.setStudOctFundingCode(form.getStudOctFundingCode());
		obj.setStudentGrade(form.getStudentGrade());
		obj.setStudentMiddleInitial(form.getStudentMiddleInitial());
		obj.setStudentFirstName(form.getStudentFirstName());
		obj.setStudentLastName(form.getStudentLastName());
		obj.setStudOctSchool(form.getStudOctSchool());
		obj.setStudOctDistrict(form.getStudOctDistrict());
		obj.setSasid(form.getSasid());
		obj.setFiscalYear(form.getFiscalYear());
		obj.setAuditId(form.getAuditId());
		saveOrUpdate(obj);
	}
	
	public AuditSasidExceptionForm setupForm() {
		AuditSasidExceptionForm form = new AuditSasidExceptionForm();
		return form;
	}
	
	public AuditSasidExceptionForm setupForm(long id) {
		AuditSasidException obj = findById(AuditSasidException.class, id); 
		
		AuditSasidExceptionForm form = new AuditSasidExceptionForm();
		form.setId(obj.getId());
		form.setAtRiskException(obj.getAtRiskException());
		form.setPupilException(obj.getPupilException());
		form.setPostSecondary(obj.getPostSecondary());
		form.setAdjustedFreeLunch(obj.getAdjustedFreeLunch());
		form.setAdjustedFundingCode(obj.getAdjustedFundingCode());
		form.setSasidException(obj.getSasidException());
		form.setParentDistrictResidence(obj.getParentDistrictResidence());
		form.setAttendanceCode(obj.getAttendanceCode());
		form.setStudOctFreeLunch(obj.getStudOctFreeLunch());
		form.setStudOctFundingCode(obj.getStudOctFundingCode());
		form.setStudentGrade(obj.getStudentGrade());
		form.setStudentMiddleInitial(obj.getStudentMiddleInitial());
		form.setStudentFirstName(obj.getStudentFirstName());
		form.setStudentLastName(obj.getStudentLastName());
		form.setStudOctSchool(obj.getStudOctSchool());
		form.setStudOctDistrict(obj.getStudOctDistrict());
		form.setSasid(obj.getSasid());
		form.setFiscalYear(obj.getFiscalYear());
		form.setAuditId(obj.getAuditId());
		return form;
	}
	
	public void setAdjustmentStatusDAO(AdjustmentStatusDAO sEExceptionStep1AdjustmentsDAO) {
		this.sEExceptionStep1AdjustmentsDAO = sEExceptionStep1AdjustmentsDAO;
	}
	
}
