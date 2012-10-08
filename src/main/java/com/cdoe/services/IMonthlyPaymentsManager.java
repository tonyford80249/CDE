
package com.cdoe.services;

import com.cdoe.biz.model.District;
import com.cdoe.ui.form.DistrictForm;

public interface IMonthlyPaymentsManager extends IBaseManager {

	void saveOrUpdate(DistrictForm districtForm);
	
	DistrictForm setupForm();
	
	DistrictForm setupForm(long id);

}
