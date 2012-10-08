
package com.cdoe.services;

import com.cdoe.ui.form.AuditSasidExceptionForm;

public interface IUpdateStudentsManager extends IBaseManager {

	void saveOrUpdate(AuditSasidExceptionForm auditTrackingForm);
	
	AuditSasidExceptionForm setupForm();
	
	AuditSasidExceptionForm setupForm(long id);

}
