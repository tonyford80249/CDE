
package com.cdoe.services;

import java.util.List;

import com.cdoe.biz.model.OrganizationUnitMaster;
import com.cdoe.biz.model.Transportation;
import com.cdoe.ui.form.TransportationForm;

public interface ICde40TransReimbFormManager extends IBaseManager {

	void saveOrUpdate(TransportationForm transportationForm);
	
	TransportationForm setupForm();
	
	TransportationForm setupForm(long id);

	//List<OrganizationUnitMaster> uploadDistricts();

	TransportationForm setupForm(String districtNos);
	
	//OrganizationUnitMaster getDistrict(String districtNo);

}
