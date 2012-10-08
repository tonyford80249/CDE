
package com.cdoe.biz;

import java.util.List;

import com.cdoe.biz.model.Transportation;

public interface ICde40SummaryDAO {

	List<Transportation> getTransportationByFiscalYear(String fiscalYear);

	int updateTransSumInfo(Transportation obj);

}
