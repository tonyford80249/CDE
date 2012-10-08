
package com.cdoe.services;

import com.cdoe.biz.model.CapitalOutlay;
import com.cdoe.ui.form.CapitalOutlayForm;

public interface ICapitalOutlayManager extends IBaseManager {

	void saveOrUpdate(CapitalOutlayForm capitalOutlayForm);
	
	CapitalOutlayForm setupForm();
	
	CapitalOutlayForm setupForm(long id);
	
	CapitalOutlayForm setupForm(String districtNos);
	
	public boolean isCapitalOutlayDistricts(String fiscalYear, String districtNos);

}
