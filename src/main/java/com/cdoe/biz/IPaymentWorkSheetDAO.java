
package com.cdoe.biz;

import java.util.List;

import com.cdoe.biz.model.Transportation;

public interface IPaymentWorkSheetDAO {

	List<Transportation> getByDistrictAndYear(String districtNos,
			String fiscalYear);

}
