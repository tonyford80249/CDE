
package com.cdoe.services;

import com.cdoe.biz.model.Transportation;
import com.cdoe.ui.form.TransportationForm;
import com.cdoe.util.UserInfo;

public interface ICde40SummaryManager extends IBaseManager {

	void saveOrUpdate(TransportationForm transportationForm);
	
	TransportationForm setupForm(String fiscalYear, UserInfo userInfo);
	
	TransportationForm setupForm(long id);

	void rejectDistrictForms(TransportationForm form);

}
