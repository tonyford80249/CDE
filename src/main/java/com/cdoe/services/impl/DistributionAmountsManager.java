
package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.FlushMode;
import org.springframework.transaction.annotation.Transactional;

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
	
	
	
	public ProrateForm setupForm(String fiscalYear, String districtNumber) {
		//Prorate obj = findById(Prorate.class, districtNumber); 
		ProrateForm form = new ProrateForm();
		
		List<Prorate> prorateList = distributionAmountsDAO.getByDistrictAndYear(districtNumber, fiscalYear);
		if (prorateList != null && prorateList.size() > 0) {
			logger.info("Prorate Transportation data received");
			form = setFormData(form, prorateList.get(0));

		} else {
			form.setFiscalYear( DateUtil.getFiscalYear());
			logger.info("Prorate Transportation data not found");
		}
		return form;
	}
	
	private Prorate findById(Class<Prorate> class1, String districtNumber) {
		// TODO Auto-generated method stub
		return null;
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
	
	@Transactional(readOnly = false)
	public void runPayment(ProrateForm prorateForm, int paymentNos) {
		String fiscalYear = prorateForm.getFiscalYear();
		if (fiscalYear == null || "".equals(fiscalYear))
			fiscalYear = DateUtil.getFiscalYear();
		
		List<Object[]> resultList = distributionAmountsDAO.getCDE40TotalByFiscalYear(fiscalYear);
		Object[] res = resultList.get(0);
		System.out.println(" res 0 " + res[0]);
		System.out.println(" res 1 " + res[1]);
		double advPay = ((Double)res[0]).doubleValue();
		double reimTran = ((Double)res[0]).doubleValue();
		
		double prorateFactor =  ((prorateForm.getTotalDistribution() != null ? prorateForm.getTotalDistribution().doubleValue() : 0 ) - advPay )/ reimTran;
	
		List<Transportation> transportationList = transportationDAO.getByYear(fiscalYear);
		
		for (Transportation transportation : transportationList) {
			
			double finalReimEntitlementProrated = prorateFactor * transportation.getFinalReimEntitlement();
			double totalPayment = finalReimEntitlementProrated +  transportation.getAdvPay();
			double migrantEducation = (totalPayment /  transportation.getTotalReimMileage()) * transportation.getMigMiles();
			transportation.setTotalReimEntitlement(totalPayment);
			transportation.setFinalReimProrated(finalReimEntitlementProrated);
			double netPayment = totalPayment - migrantEducation;
			double districtDistribution = netPayment;
			if (paymentNos == FIRST_PAYMENT ) {
				transportation.setFirstPayment(netPayment);
				prorateForm.setProrateFactor1stPayment(prorateFactor);
			}
			else {
				double secondPayment = netPayment - transportation.getFirstPayment();
				transportation.setSecondPayment(secondPayment);
				prorateForm.setProrateFactor2ndPayment(prorateFactor);
			}
			transportation.setDistrictDistribution(districtDistribution);
			
			//commit;
			saveOrUpdate(transportation);
			saveOrUpdate(prorateForm);
		}
	}
	
	
	
	
	
	
	public void updateProrateNote(ProrateForm prorateForm) {
		distributionAmountsDAO.updateProrateNote(prorateForm.getFiscalYear(), prorateForm.getFundingSources());
		
	}
}
