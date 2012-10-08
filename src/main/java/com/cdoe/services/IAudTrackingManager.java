
package com.cdoe.services;

import com.cdoe.biz.model.AuditFpc;
import com.cdoe.ui.form.AuditFpcForm;

public interface IAudTrackingManager extends IBaseManager {

	void saveOrUpdate(AuditFpcForm auditFpcForm);
	
	AuditFpcForm setupForm();
	
	AuditFpcForm setupForm(long id);

}
