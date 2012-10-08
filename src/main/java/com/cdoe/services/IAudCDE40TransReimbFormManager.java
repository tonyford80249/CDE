
package com.cdoe.services;

import com.cdoe.ui.form.AuditTranForm;

public interface IAudCDE40TransReimbFormManager extends IBaseManager {

	void saveOrUpdate(AuditTranForm auditTranForm);
	
	AuditTranForm setupForm();
	
	AuditTranForm setupForm(long id);

}
