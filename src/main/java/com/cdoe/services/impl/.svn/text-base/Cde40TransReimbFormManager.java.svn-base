
package com.cdoe.services.impl;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.biz.ICde40TransReimbFormDAO;
import com.cdoe.biz.IDistrictDetailDAO;
import com.cdoe.biz.model.OrganizationUnitMaster;
import com.cdoe.biz.model.Transportation;
import com.cdoe.services.ICde40TransReimbFormManager;
import com.cdoe.ui.form.TransportationForm;
import com.cdoe.util.DateUtil;

public class Cde40TransReimbFormManager extends BaseManager implements ICde40TransReimbFormManager {

	private static final Logger logger = Logger.getLogger(Cde40TransReimbFormManager.class);
	
	private ICde40TransReimbFormDAO cde40TransReimbFormDAO;
	
	private IDistrictDetailDAO districtDetailDAO;
	
	
	public void setCde40TransReimbFormDAO(ICde40TransReimbFormDAO cde40TransReimbFormDAO) {
		this.cde40TransReimbFormDAO = cde40TransReimbFormDAO;
	}
	
	public void setDistrictDetailDAO(IDistrictDetailDAO districtDetailDAO) {
		this.districtDetailDAO = districtDetailDAO;
	}

	public void saveOrUpdate(TransportationForm form) {
		long id = form.getId();
		Transportation obj = findById(Transportation.class, id); 
		if (obj == null) {
			obj = new Transportation();
		}
		if (form.getFiscalYear() == null || "".equals(form.getFiscalYear()))
			form.setFiscalYear(DateUtil.getPrevFiscalYear());
		calculateFinalReimEntitlement(form);
		//Save or update values
		obj.setDistrictNumber(form.getDistrictNumber());
		obj.setFiscalYear(form.getFiscalYear());
		obj.setDateChanged(Calendar.getInstance().getTime().toString());
		
		obj.setNamePreparerCde40(form.getNamePreparerCde40());
		obj.setPhonePreparerCde40(form.getPhonePreparerCde40());
		obj.setEmailPreparerCde40(form.getEmailPreparerCde40());
	
		obj.setPupilTran(form.getPupilTran());
		obj.setOperTran(form.getOperTran());
		obj.setOtherRevenue(form.getOtherRevenue());
		
		if (form.getNetCurrentOperExpend() == null)
			obj.setNetCurrentOperExpend(form.getOperTran());
		
		obj.setMigMiles(form.getMigMiles());
		obj.setRegDMiles(form.getRegDMiles());
		obj.setSchoolDays(form.getSchoolDays());
		obj.setBoardTran(form.getBoardTran());
		obj.setTotalMiles(form.getTotalMiles());
		
		obj.setActMiles(form.getActMiles());
		obj.setDesegReim(form.getDesegReim());
		obj.setReimTran(form.getReimTran());
		obj.setReimTranLy(form.getReimTranLy());
		obj.setAdvPayLy(form.getAdvPayLy());
		obj.setReimAdvPay(form.getReimAdvPay());
		obj.setAdvPay(form.getAdvPay());
		obj.setFirstPayment(form.getFirstPayment());
		obj.setSecondPayment(form.getSecondPayment());
		//obj.setDistrictDistribution(form.getDistrictDistribution());
		obj.setCofrsBatchNumber(form.getCofrsBatchNumber());
		//obj.setCofrsDatePaid(form.getCofrsDatePaid());
		//obj.setTotalReimMileage(form.getTotalReimMileage());
		obj.setMileageEntitlement(form.getMileageEntitlement());
		obj.setExCosts(form.getExCosts());
		obj.setMaxReimEntitlement(form.getMaxReimEntitlement());
		obj.setReimEntitlement(form.getReimEntitlement());
		obj.setTotalReimEntitlement(form.getTotalReimEntitlement());
		obj.setFinalReimEntitlement(form.getFinalReimEntitlement());
		obj.setErrors("None");
		//obj.setFinalReimProrated(form.getFinalReimProrated());
		
	    saveOrUpdate(obj);
	}
	
	
	
	//not being used
	public TransportationForm setupForm() {
		TransportationForm form = new TransportationForm();
		return form;
	}
	
	public TransportationForm setupForm(String districtNos) {
		TransportationForm form = new TransportationForm();
		
		String fiscalYear = DateUtil.getPrevFiscalYear();
		
		
		List<Transportation> transportationList = cde40TransReimbFormDAO
				.getByDistrictAndYear(districtNos, fiscalYear);
		if (transportationList != null && transportationList.size() > 0) {
			logger.info("Transportation data received");
			form = setFormData(transportationList.get(0));
			form.setFiscalYear(fiscalYear);

		} else {
			logger.info("Transportation data not found for this district. Create new data");
			//zero out the fields for display
			form = initFormData();
		
		}
		return form;
	}
	
	//Place holder - not used
	public TransportationForm setupForm(long id) {
		Transportation obj = findById(Transportation.class, id); 
		 
		TransportationForm form = new TransportationForm();
		
		return form;
	}
	
	private TransportationForm setFormData(Transportation obj) {
		TransportationForm form = new TransportationForm();
		form.setId(obj.getId());
		form.setDistrictNumber(obj.getDistrictNumber());
		form.setDateChanged(obj.getDateChanged());
		form.setErrors(obj.getErrors());
		form.setPupilTran(obj.getPupilTran());
		form.setOperTran(obj.getOperTran());
		form.setIndCont(obj.getIndCont());
		form.setCapOutTran(obj.getCapOutTran());
		form.setMigMiles(obj.getMigMiles());
		form.setRegDMiles(obj.getRegDMiles());
		form.setSchoolDays(obj.getSchoolDays());
		form.setRegDays(obj.getRegDays());
		form.setBoardTran(obj.getBoardTran());
		form.setExReim(obj.getExReim());
		form.setDesegReim(obj.getDesegReim());
		form.setReimTran(obj.getReimTran());
		form.setReimTranLy(obj.getReimTranLy());
		form.setAdvPayLy(obj.getAdvPayLy());
		form.setReimAdvPay(obj.getReimAdvPay());
		form.setAdvPay(obj.getAdvPay());
		form.setActMiles(obj.getActMiles());
		form.setTotalMiles(obj.getTotalMiles());
		form.setFiscalYear(obj.getFiscalYear());
		form.setCdeComments(obj.getCdeComments());
		form.setFirstPayment(obj.getFirstPayment());
		form.setSecondPayment(obj.getSecondPayment());
		form.setDistrictDistribution(obj.getDistrictDistribution());
		form.setCofrsBatchNumber(obj.getCofrsBatchNumber());
		form.setCofrsDatePaid(obj.getCofrsDatePaid());
		form.setNamePreparerCde40(obj.getNamePreparerCde40());
		form.setPhonePreparerCde40(obj.getPhonePreparerCde40());
		form.setEmailPreparerCde40(obj.getEmailPreparerCde40());
		form.setFeesCollected(obj.getFeesCollected());
		form.setOtherRevenue(obj.getOtherRevenue());
		form.setNetCurrentOperExpend(obj.getNetCurrentOperExpend());
		form.setTotalReimMileage(obj.getTotalReimMileage());
		form.setMileageEntitlement(obj.getMileageEntitlement());
		form.setExCosts(obj.getExCosts());
		form.setMaxReimEntitlement(obj.getMaxReimEntitlement());
		form.setReimEntitlement(obj.getReimEntitlement());
		form.setTotalReimEntitlement(obj.getTotalReimEntitlement());
		form.setFinalReimEntitlement(obj.getFinalReimEntitlement());
		form.setFinalReimProrated(obj.getFinalReimProrated());
		form.setErrors(obj.getErrors());
		return form;
	}
	
	
	private TransportationForm initFormData() {
		TransportationForm form = new TransportationForm();
		form.setPupilTran(0l);
		form.setOperTran(0.00);
		
		form.setMigMiles(0.0);
		form.setRegDMiles(0.0);
		form.setSchoolDays(0l);
		form.setRegDays(0l);
		form.setBoardTran(0l);
		form.setAdvPay(0.00);
		form.setActMiles(0.0);
		form.setTotalMiles(0.00);
		form.setFeesCollected(0.00);
		form.setOtherRevenue(0.00);
		form.setNetCurrentOperExpend(0.00);
		form.setTotalReimMileage(0.0);
		form.setMileageEntitlement(0.0);
	    return form;
		
	}
	
	public void calculateFinalReimEntitlement(TransportationForm form) {
		
		List<Transportation> transportationList = cde40TransReimbFormDAO
				.getByDistrictAndYear(form.getDistrictNumber(), DateUtil.getPrevFiscalYear(form.getFiscalYear()));
		
		double reimburseTransLastYear = 0;
		double advancePaymentLastYear = 0;
		if (transportationList != null && transportationList.size() > 0) {
			logger.info("Transportation data received");
			Transportation prevYearTransportationData = transportationList.get(0);
			if (prevYearTransportationData != null && prevYearTransportationData.getReimTranLy() != null) {
				 Double reimTranLy =  prevYearTransportationData.getReimTranLy();
				 reimburseTransLastYear = reimTranLy.doubleValue();
				
			}
			if (prevYearTransportationData != null && prevYearTransportationData.getAdvPayLy() != null) {
				 Double advPayLy =  prevYearTransportationData.getAdvPayLy();
				 advancePaymentLastYear = advPayLy.doubleValue();
				
			}
			

		} else {
			logger.info("Transportation data not found for the last year for this district. Default to 0");
		}
		double totalCurrentOperExpense =form.getOperTran().doubleValue();
		double capitalOutlayTotalFunding = 0; //Read from the Capital outlay table.
		double netCurrentOperExpend =  totalCurrentOperExpense - capitalOutlayTotalFunding; //form.getNetCurrentOperExpend().doubleValue();
		double migMiles = form.getMigMiles().doubleValue();
		double regdMiles = form.getRegDMiles().doubleValue();
		double schoolDays= form.getSchoolDays().doubleValue();
		
		double totalRegularMileage = regdMiles * schoolDays;
		form.setTotalMiles(totalRegularMileage);
		
		double totalReimburseMileage =  migMiles + totalRegularMileage;
		form.setTotalReimMileage(totalReimburseMileage);
		
		double mileageEntitlement = totalReimburseMileage *0.3787;
		form.setMileageEntitlement(mileageEntitlement);
		
		double excessCosts= netCurrentOperExpend - mileageEntitlement;
		form.setExCosts(excessCosts);
		
		double excessCostEntitlement = excessCosts*0.3787 ;
		double mileEntitleExcessCostEntitle = mileageEntitlement + excessCostEntitlement;
		form.setExReim(excessCostEntitlement);
		double maxReimbursement = netCurrentOperExpend * 0.90;
		form.setMaxReimEntitlement(maxReimbursement);
		
		double calcReimburseEntitleCY = maxReimbursement;
		
		
		if (mileEntitleExcessCostEntitle < maxReimbursement)
			calcReimburseEntitleCY = mileEntitleExcessCostEntitle;
		
		form.setReimTran(calcReimburseEntitleCY);
		double calcReimburseEntitleLY =  reimburseTransLastYear; 
		double reimburseEntitleCY = (calcReimburseEntitleCY > calcReimburseEntitleLY) ? calcReimburseEntitleCY : calcReimburseEntitleLY;
	    form.setReimEntitlement(reimburseEntitleCY)	;
		double boardTran = form.getBoardTran().doubleValue();
		double actualReimburseEntitleCY = reimburseEntitleCY + boardTran;
	
		double advReimburseEntCY = advancePaymentLastYear; 
		//form.setA
		double finalReimburseEntCY = actualReimburseEntitleCY - advReimburseEntCY;
		form.setFinalReimEntitlement(finalReimburseEntCY);
		double advanceReimburseEntitleNY = actualReimburseEntitleCY * 0.2;
		form.setAdvPay(advanceReimburseEntitleNY);
		form.setAdvPayLy(advancePaymentLastYear);
		form.setReimTranLy(calcReimburseEntitleLY);
	}
	
}
