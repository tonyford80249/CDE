
package com.cdoe.services;

import com.cdoe.biz.model.Transportation;
import com.cdoe.ui.form.TransportationForm;

public interface ICoforsUploadManager extends IBaseManager {

	void saveOrUpdate(TransportationForm transportationForm);
	
	TransportationForm setupForm();
	
	TransportationForm setupForm(long id);

}
