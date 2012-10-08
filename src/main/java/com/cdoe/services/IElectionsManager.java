
package com.cdoe.services;

import com.cdoe.biz.model.ElectionsDetail;
import com.cdoe.ui.form.ElectionsDetailForm;

public interface IElectionsManager extends IBaseManager {

	void saveOrUpdate(ElectionsDetailForm electionsDetailForm);
	
	ElectionsDetailForm setupForm();
	
	ElectionsDetailForm setupForm(long id);

}
