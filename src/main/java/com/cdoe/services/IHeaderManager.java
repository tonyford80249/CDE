/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.services;

import com.cdoe.biz.model.VHeader;
import com.cdoe.ui.form.VHeaderForm;

public interface IHeaderManager extends IBaseManager {

	void saveOrUpdate(VHeaderForm vHeaderForm);
	
	VHeaderForm setupForm();
	
	VHeaderForm setupForm(long id);

}
