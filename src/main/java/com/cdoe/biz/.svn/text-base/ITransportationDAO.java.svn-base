
package com.cdoe.biz;

import java.util.List;

import com.cdoe.biz.model.OrganizationUnitMaster;
import com.cdoe.biz.model.Transportation;

public interface ITransportationDAO {

	List<Transportation> getByDistrictAndYear(String districtNos,
			String fiscalYear);

	public List<Transportation> getByYear(final String fiscalYear);
	
	public int updateCapOutTran(final String districtNos, final String fiscalYear, double capitalOutlayTotal);
	
	public List<String> getCapitalOutlayDistricts(String fiscalYear);
}
