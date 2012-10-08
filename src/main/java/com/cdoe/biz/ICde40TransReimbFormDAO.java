
package com.cdoe.biz;

import java.util.List;

import com.cdoe.biz.model.OrganizationUnitMaster;
import com.cdoe.biz.model.Transportation;

public interface ICde40TransReimbFormDAO {

	List<Transportation> getByDistrictAndYear(String districtNos,
			String fiscalYear);

	List<OrganizationUnitMaster> getAllDistricts();

}
