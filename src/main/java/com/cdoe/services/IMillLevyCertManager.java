
package com.cdoe.services;

import com.cdoe.biz.model.VData;
import com.cdoe.ui.form.VDataForm;

public interface IMillLevyCertManager extends IBaseManager {

	void saveOrUpdate(VDataForm vDataForm);
	
	VDataForm setupForm();
	
	VDataForm setupForm(long id);

}
