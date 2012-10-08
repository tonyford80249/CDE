
package com.cdoe.services;

import com.cdoe.biz.model.AuditEqual;
import com.cdoe.ui.form.AuditEqualForm;

public interface IAuditSummaryManager extends IBaseManager {

	void saveOrUpdate(AuditEqualForm auditEqualForm);
	
	AuditEqualForm setupForm();
	
	AuditEqualForm setupForm(long id);

}
