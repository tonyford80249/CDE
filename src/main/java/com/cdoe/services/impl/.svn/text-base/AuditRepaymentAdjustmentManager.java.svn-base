/**
 * 
 */
package com.cdoe.services.impl;

import com.cdoe.biz.model.AuditRepaymentAdjustment;
import com.cdoe.services.IAuditRepaymentAdjustmentManager;
import com.cdoe.ui.form.AuditRepaymentAdjustmentForm;

/**
 * @author dyn-8
 *
 */
public class AuditRepaymentAdjustmentManager extends BaseManager implements IAuditRepaymentAdjustmentManager {
	
	public void saveOrUpdate(AuditRepaymentAdjustmentForm form) {
		AuditRepaymentAdjustment dto = null;
		if (form.getId() != null && form.getId() > 0)
			dto = getHibernateDAO().findByPk(AuditRepaymentAdjustment.class, form.getId());
		else
			dto = new AuditRepaymentAdjustment();
		dto.setAmount(form.getAmount());
		dto.setBeginFiscalMonth(form.getBeginFiscalMonth());
		dto.setBeginFiscalYear(form.getBeginFiscalYear());
		dto.setEndFiscalMonth(form.getEndFiscalMonth());
		dto.setEndFiscalYear(form.getEndFiscalYear());
		dto.setDistrictNumber(form.getDistrictNumber());
		dto.setFrequency(form.getFrequency());
		this.saveOrUpdate(dto);
	}


}
