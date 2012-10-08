
package com.cdoe.biz;

import java.util.List;

import com.cdoe.biz.model.Prorate;

public interface IDistributionAmountsDAO {

	public List<Prorate> getByFiscalYear(String fiscalYear);

	public int updateProrateNote(String fiscalYear, String fundingSources);
	
	public List<Object[]> getCDE40TotalByFiscalYear(final String fiscalYear);

}
