
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.services.IPaymentWorkSheetManager;
import com.cdoe.biz.IDistrictDetailDAO;
import com.cdoe.biz.IPaymentWorkSheetDAO;
import com.cdoe.biz.model.*;
import com.cdoe.ui.form.TransportationForm;
import com.cdoe.util.DateUtil;

public class PaymentWorkSheetManager extends TransportationDataManager implements IPaymentWorkSheetManager {

	private static final Logger logger = Logger.getLogger(PaymentWorkSheetManager.class);
	
	private IPaymentWorkSheetDAO paymentWorkSheetDAO;
	
	private IDistrictDetailDAO districtDetailDAO;
	


	
	
	
	public TransportationForm setupForm() {
		TransportationForm form = new TransportationForm();
		return form;
	}
        
	public TransportationForm setupForm(String districtNos, String districtName, String fiscalYear) {
				
		//String fiscalYear = DateUtil.getFiscalYear(); 
		List<Transportation> transportationList = paymentWorkSheetDAO
				.getByDistrictAndYear(districtNos, fiscalYear);
                
		if (transportationList != null && transportationList.size() > 0) {
			logger.info("Transportation data received");
			TransportationForm form = setFormData(transportationList.get(0));
                                                
                        form.setDistrictName(districtName);
                                                
                        form.setFiscalYear(fiscalYear);
                        
                        form.setDistrictNumber(districtNos);
                        
                        form.setValid(true);
                        
                        return form;

		} else {
			logger.info("Transportation data not found");
                        TransportationForm form = new TransportationForm();
                                
                        form.setDistrictName(districtName);
                        
                        form.setFiscalYear(fiscalYear);
                        
                        form.setDistrictNumber(districtNos);
                        
                        return form;
		}
//		districtDetailDAO.getAllDistricts();
//		List<OrganizationUnitMaster> districts = districtDetailDAO.getAllDistricts();
//		String[] districtInfo = new String[districts.size()];
//		int i=0;
//		for (OrganizationUnitMaster district:districts ) {
//			districtInfo[i] = district.getOrganizationCode() + "  - " + district.getOrganizationName();
//			i++;
//		}
		//form.setDistrictNumberName(districtInfo);
		//return form;
	}
	
	public void setDistrictDetailDAO(IDistrictDetailDAO districtDetailDAO) {
		this.districtDetailDAO = districtDetailDAO;
	}
		
	public void setPaymentWorkSheetDAO(IPaymentWorkSheetDAO paymentWorkSheetDAO) {
		this.paymentWorkSheetDAO = paymentWorkSheetDAO;
	}
	
}
