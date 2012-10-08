
package com.cdoe.services;

import com.cdoe.biz.model.Transportation;
import com.cdoe.ui.form.TransportationForm;

public interface ICde40SummaryManager extends IBaseManager {

	void saveOrUpdate(TransportationForm transportationForm);
	
	TransportationForm setupForm(String fiscalYear);
	
	TransportationForm setupForm(long id);

}
