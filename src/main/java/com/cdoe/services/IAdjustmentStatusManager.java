
package com.cdoe.services;

import com.cdoe.ui.form.AuditSasidExceptionForm;


public interface IAdjustmentStatusManager extends IBaseManager {

	void saveOrUpdate(AuditSasidExceptionForm auditSasidExceptionForm);
	
	AuditSasidExceptionForm setupForm();
	
	AuditSasidExceptionForm setupForm(long id);

}
