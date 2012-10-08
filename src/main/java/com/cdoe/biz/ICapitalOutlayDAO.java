
package com.cdoe.biz;

import java.util.List;

import com.cdoe.biz.model.CapitalOutlay;

public interface ICapitalOutlayDAO {

	List<CapitalOutlay> getByDistrictAndYear(String districtNos,
			String fiscalYear);

}
