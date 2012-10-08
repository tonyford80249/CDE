
package com.cdoe.services;

import com.cdoe.biz.model.Prorate;
import com.cdoe.ui.form.ProrateForm;

public interface IDistributionAmountsManager extends IBaseManager {

	void saveOrUpdate(ProrateForm prorateForm);
	
	ProrateForm setupForm();
	
	ProrateForm setupForm(long id);

	ProrateForm setupForm(String fiscalYear, String districtNos);

	void runFirstPayment(ProrateForm prorateForm);

	void runSecondPayment(ProrateForm prorateForm);

	void updateProrateNote(ProrateForm prorateForm);

}
