
package com.cdoe.services;

import java.io.IOException;

//import jxl.write.WriteException;

import com.cdoe.biz.model.Prorate;
import com.cdoe.ui.form.ProrateForm;

public interface IDistrictPaymentReportManager extends IBaseManager {

	void saveOrUpdate(ProrateForm prorateForm);
	
	ProrateForm setupForm(String fiscalYear);
	
	ProrateForm setupForm(long id);

	void createDistrictReport(String fileName, ProrateForm form)
			throws IOException;//, WriteException;

}
