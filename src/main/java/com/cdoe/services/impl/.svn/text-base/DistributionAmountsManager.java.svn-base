
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.biz.IDistributionAmountsDAO;
import com.cdoe.biz.ITransportationDAO;
import com.cdoe.biz.model.Prorate;
import com.cdoe.biz.model.Transportation;
import com.cdoe.services.IDistributionAmountsManager;
import com.cdoe.ui.form.ProrateForm;
import com.cdoe.util.DateUtil;

public class DistributionAmountsManager extends BaseManager implements IDistributionAmountsManager {

	private static final Logger logger = Logger.getLogger(DistributionAmountsManager.class);
	
	private IDistributionAmountsDAO distributionAmountsDAO;
	private ITransportationDAO transportationDAO;
	
	public void setDistributionAmountsDAO(IDistributionAmountsDAO distributionAmountsDAO) {
		this.distributionAmountsDAO = distributionAmountsDAO;
	}
	
	public void setTransportationDAO(ITransportationDAO transportationDAO) {
		this.transportationDAO = transportationDAO;
	}
	
	public static final int FIRST_PAYMENT = 1;
	public static final int SECOND_PAYMENT = 2;
		
	
	public void saveOrUpdate(ProrateForm form) {
		long id = form.getId();
		Prorate obj = findById(Prorate.class, id); 
		if (obj == null) {
			obj = new Prorate();
		}
		obj.setFiscalYear(form.getFiscalYear() != null ? form.getFiscalYear() : DateUtil.getFiscalYear());
		obj.setProrateFactor1stPayment(form.getProrateFactor1stPayment());
		obj.setProrateFactor2ndPayment(form.getProrateFactor2ndPayment());
		obj.setFundingSources(form.getFundingSources());
		obj.setTotalFirstPayment(form.getTotalFirstPayment());
		obj.setTotalSecondPayment(form.getTotalSecondPayment());
		obj.setTotalDistribution(form.getTotalDistribution());
		saveOrUpdate(obj);
	}
	
	public ProrateForm setupForm() {
		ProrateForm form = new ProrateForm();
		return form;
	}
	
	//Not Used
	public ProrateForm setupForm(long id) {
		Prorate obj = findById(Prorate.class, id); 
		
		ProrateForm form = new ProrateForm();
		form.setId(obj.getId());
		form.setFiscalYear(obj.getFiscalYear());
		form.setProrateFactor1stPayment(obj.getProrateFactor1stPayment());
		form.setProrateFactor2ndPayment(obj.getProrateFactor2ndPayment());
		form.setFundingSources(obj.getFundingSources());
		form.setTotalFirstPayment(obj.getTotalFirstPayment());
		form.setTotalSecondPayment(obj.getTotalSecondPayment());
		form.setTotalDistribution(obj.getTotalDistribution());
		return form;
	}
	
	
	
	public ProrateForm setupForm(String fiscalYear) {
		ProrateForm form = new ProrateForm();
		
		List<Prorate> prorateList = distributionAmountsDAO.getByFiscalYear(fiscalYear);
		if (prorateList != null && prorateList.size() > 0) {
			logger.info("Prorate Transportation data received");
			form = setFormData(form, prorateList.get(0));

		} else {
			form.setFiscalYear( DateUtil.getPrevFiscalYear());
			logger.info("Prorate Transportation data not found");
		}
		return form;
	}
	
	public ProrateForm setFormData(ProrateForm form, Prorate obj) {
		form.setId(obj.getId());
		form.setFiscalYear(obj.getFiscalYear());
		form.setProrateFactor1stPayment(obj.getProrateFactor1stPayment());
		form.setProrateFactor2ndPayment(obj.getProrateFactor2ndPayment());
		form.setFundingSources(obj.getFundingSources());
		form.setTotalFirstPayment(obj.getTotalFirstPayment());
		form.setTotalSecondPayment(obj.getTotalSecondPayment());
		form.setTotalDistribution(obj.getTotalDistribution());
		return form;
	}

	@Override
	public void runFirstPayment(ProrateForm prorateForm) {
		runPayment(prorateForm, FIRST_PAYMENT);
		
	}

	@Override
	public void runSecondPayment(ProrateForm prorateForm) {
		runPayment(prorateForm, SECOND_PAYMENT);
		
	}
	
	public void runPayment(ProrateForm prorateForm, int paymentNos) {
		String fiscalYear = prorateForm.getFiscalYear();
		if (fiscalYear == null || "".equals(fiscalYear))
			fiscalYear = DateUtil.getFiscalYear();
		
		List<Object[]> resultList = distributionAmountsDAO.getCDE40TotalByFiscalYear(fiscalYear);
		Object[] res = resultList.get(0);
		
		double advPay = ((Double)res[0]).doubleValue();
		double reimTran = ((Double)res[1]).doubleValue();
		logger.debug(" advPay 0 " + advPay);
		logger.debug(" reimTran 1 " + reimTran);
		
		double prorateFactor =  ((prorateForm.getTotalDistribution() != null ? prorateForm.getTotalDistribution().doubleValue() : 0 ) - advPay )/ reimTran;
	
		List<Transportation> transportationList = transportationDAO.getByYear(fiscalYear);
		
		for (Transportation transportation : transportationList) {
			logger.debug("prorateFactor " + prorateFactor);
			double finalReimEntitlementProrated = prorateFactor * (transportation.getFinalReimEntitlement() != null ? transportation.getFinalReimEntitlement().doubleValue() : 0);
			double totalPayment = finalReimEntitlementProrated +  (transportation.getAdvPay() != null ? transportation.getAdvPay().doubleValue() : 0);
			double totalMileage =  (transportation.getTotalReimMileage() != null ? transportation.getTotalReimMileage().doubleValue() : 0) * (transportation.getMigMiles() != null ? transportation.getMigMiles().doubleValue() : 0);
			double migrantEducation = 0;
			if (totalMileage != 0)
			  migrantEducation = (totalPayment /totalMileage);
			transportation.setTotalReimEntitlement(totalPayment);
			transportation.setFinalReimProrated(finalReimEntitlementProrated);
			double netPayment = totalPayment - migrantEducation;
			double districtDistribution = netPayment;
			if (paymentNos == FIRST_PAYMENT ) {
				transportation.setFirstPayment(netPayment);
				prorateForm.setProrateFactor1stPayment(prorateFactor);
			}
			else {
				double secondPayment = netPayment - (transportation.getFirstPayment() != null ? transportation.getFirstPayment().doubleValue() : 0);
				transportation.setSecondPayment(secondPayment);
				prorateForm.setProrateFactor2ndPayment(prorateFactor);
			}
			transportation.setDistrictDistribution(districtDistribution);
			
			//commit;
			saveOrUpdate(transportation);
			
		}
		saveOrUpdate(prorateForm);
	}
	
	public void updateProrateNote(ProrateForm prorateForm) {
		distributionAmountsDAO.updateProrateNote(prorateForm.getFiscalYear(), prorateForm.getFundingSources());
		
	}
}
