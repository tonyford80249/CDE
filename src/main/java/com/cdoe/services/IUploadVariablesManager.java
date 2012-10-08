
package com.cdoe.services;

import com.cdoe.biz.model.StateEqualbacked;
import com.cdoe.ui.form.StateEqualForm;

public interface IUploadVariablesManager extends IBaseManager {

	void saveOrUpdate(StateEqualForm stateEqualForm);
	
	StateEqualForm setupForm();
	
	StateEqualForm setupForm(long id);

}
