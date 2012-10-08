
package com.cdoe.services;

import com.cdoe.biz.model.Transportation;
import com.cdoe.ui.form.TransportationForm;

public interface IPaymentWorkSheetManager extends IBaseManager {

	void saveOrUpdate(TransportationForm transportationForm);
	
	TransportationForm setupForm(String districtNos, String distrinctName, String fiscalYear);
	
	TransportationForm setupForm(long id);

}
