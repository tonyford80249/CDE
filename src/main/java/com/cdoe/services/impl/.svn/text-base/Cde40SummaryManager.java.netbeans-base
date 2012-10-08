package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.biz.ICde40SummaryDAO;
import com.cdoe.biz.model.Transportation;
import com.cdoe.services.ICde40SummaryManager;
import com.cdoe.ui.form.TransportationForm;
import com.cdoe.ui.form.grid.TransportationGrid;
import com.cdoe.util.DateUtil;

public class Cde40SummaryManager extends TransportationDataManager implements
		ICde40SummaryManager {

	private static final Logger logger = Logger
			.getLogger(Cde40SummaryManager.class);

	private ICde40SummaryDAO cde40SummaryDAO;
	private ReferenceDataManager referenceDataManager = new ReferenceDataManager();
	
	public void saveOrUpdate(TransportationForm form) {
		
		List<TransportationGrid> transGridList = form.getTransportationGridList();
		for (TransportationGrid transGrid: transGridList) {
			long id = transGrid.getId();
			Transportation obj = findById(Transportation.class, id); 
			if (obj == null) {
				super.saveOrUpdate(form);
				
			} else {
				obj = updateTransSumInfo(obj, transGrid);
				saveOrUpdate(obj);
			}
		}
		
	}
	
	private Transportation updateTransSumInfo(Transportation obj, TransportationGrid transGrid) {
		obj.setPupilTran(transGrid.getPupilTran());
		obj.setCapOutTran(transGrid.getCapOutTran());
		obj.setMigMiles(transGrid.getMigMiles());
		obj.setRegDMiles(transGrid.getRegDMiles());
		obj.setSchoolDays(transGrid.getSchoolDays());
		obj.setBoardTran(transGrid.getBoardTran());
		obj.setReimTranLy(transGrid.getReimTranLy());
		obj.setAdvPay(transGrid.getAdvPay());
		obj.setActMiles(transGrid.getActMiles());
		obj.setTotalMiles(transGrid.getTotalMiles());
		
		 return obj;
	}

	public TransportationForm setupForm(String fiscalYear) {
		TransportationForm form = new TransportationForm();
		//String fiscalYear = "20102011"; //DateUtil.getFiscalYear();
		List<Transportation> transportationList = cde40SummaryDAO
				.getTransportationByFiscalYear(fiscalYear);
		if (transportationList != null && transportationList.size() > 0) {
			logger.info("Transportation data received");
			form = setFormData(transportationList.get(0));
			setGridData(form, transportationList);

		} else {
			logger.info("Transportation data not found");
		}
		return form;
	}

	protected TransportationForm setGridData(TransportationForm form,List<Transportation> transportationList) {
		List<TransportationGrid> transGridList = form.getTransportationGridList();
		for (Transportation transportation : transportationList) {
			TransportationGrid transGrid = new TransportationGrid();
			transGrid.setId(transportation.getId()); 
			transGrid.setNetCurrentOperExpend(transportation.getNetCurrentOperExpend());
			transGrid.setMigMiles(transportation.getMigMiles());
			transGrid.setRegDMiles(transportation.getRegDMiles());
			transGrid.setSchoolDays(transportation.getSchoolDays());
			transGrid.setBoardTran(transportation.getBoardTran());
			transGrid.setPupilTran(transportation.getPupilTran());
			transGrid.setActMiles(transportation.getActMiles());
			transGrid.setTotalMiles(transportation.getTotalMiles());
			transGrid.setFeesCollected(transportation.getFeesCollected());
			transGrid.setCapOutTran(transportation.getCapOutTran());
			transGrid.setReimTranLy(transportation.getReimTranLy());
			transGrid.setAdvPay(transportation.getAdvPay());
			transGrid.setDistrictNumber(transportation.getDistrictNumber());
			try {
				transGrid.setDistrictName(referenceDataManager.getDistrictName((transportation.getDistrictNumber())));
			} catch (Exception e) {
				transGrid.setDistrictName("No Matching District Name");
			}
			
			//transGrid.setDateUpdated("12/18/2012");
			transGridList.add(transGrid);
		}

		return form;
	}

	public void setCde40SummaryDAO(ICde40SummaryDAO cde40SummaryDAO) {
		this.cde40SummaryDAO = cde40SummaryDAO;
	}
	
	/*public void setReferenceDataManager(ReferenceDataManager referenceDataManager) {
		this.referenceDataManager = referenceDataManager;
	}*/


}
