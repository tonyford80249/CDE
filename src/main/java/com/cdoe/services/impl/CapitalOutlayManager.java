package com.cdoe.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.biz.ICapitalOutlayDAO;
import com.cdoe.biz.ITransportationDAO;
import com.cdoe.biz.model.CapitalOutlay;
import com.cdoe.biz.model.Transportation;
import com.cdoe.services.ICapitalOutlayManager;
import com.cdoe.ui.form.CapitalOutlayForm;
import com.cdoe.ui.form.grid.CapitalOutlayGrid;
import com.cdoe.util.DateUtil;

public class CapitalOutlayManager extends BaseManager implements
		ICapitalOutlayManager {

	private static final Logger logger = Logger
			.getLogger(CapitalOutlayManager.class);

	private ICapitalOutlayDAO capitalOutlayDAO;
	
	private ITransportationDAO transportationDAO;

	
	public void setTransportationDAO(ITransportationDAO transportationDAO) {
		this.transportationDAO = transportationDAO;
	}
	

	public void saveOrUpdate(CapitalOutlayForm form) {
		List<CapitalOutlayGrid> capitalOutlayGridList = form
				.getCapitalOutlayGridList();
		for (CapitalOutlayGrid cog : capitalOutlayGridList) {
			long id = cog.getId();
			logger.debug(cog.getTotalPurchasePrice());
			
			CapitalOutlay obj = findById(CapitalOutlay.class, id);
			if (obj == null) {
				obj = new CapitalOutlay();
			}
			
			obj.setDistrictNumber(form.getDistrictNumber());
			obj.setFiscalYear(form.getFiscalYear());
			if (form.getFiscalYear() != null)
				obj.setBaseYear(new Long(form.getFiscalYear()).longValue());
		
			obj.setRelatedYear(cog.getRelatedYear());
			obj.setTotalPurchasePrice(cog.getTotalPurchasePrice());
			obj.setDepreciationCycle(cog.getDepreciationCycle());
			obj.setPrevDepreciatedAmt(cog.getPrevDepreciatedAmt());
			obj.setRemainingAmt(cog.getRemainingAmt());
			obj.setDepreciationPy(cog.getDepreciationPy());
			obj.setContractorMiles(cog.getContractorMiles());
			obj.setOutlayExclusion(cog.getOutlayExclusion());
			obj.setCapitalOutlayTotalFunding(form.getCapitalOutlayTotalFunding());
			saveOrUpdate(obj);
			
		}
		transportationDAO.updateCapOutTran(form.getDistrictNumber(), form.getFiscalYear(), form.getCapitalOutlayTotalFunding());
	}

	public CapitalOutlayForm setupForm() {
		CapitalOutlayForm form = new CapitalOutlayForm();
		return form;
	}
	
	@SuppressWarnings("unused")
	public CapitalOutlayForm setupForm(String districtNos) {
		CapitalOutlayForm form = new CapitalOutlayForm();
		

		List<CapitalOutlayGrid> capitalOutlayGridList = form.getCapitalOutlayGridList();

		String fiscalYear = DateUtil.getPrevFiscalYear();
		List<CapitalOutlay> capitalOutlayList = capitalOutlayDAO
				.getByDistrictAndYear(districtNos, fiscalYear);
		form.setFiscalYear(fiscalYear);
		form.setDistrictNumber(districtNos);
		form.setBaseYear(new Long(fiscalYear).longValue());
		
		if (capitalOutlayList != null && capitalOutlayList.size() > 0) {
			logger.debug("Nos of records retrieved " + capitalOutlayList.size());
	
			for (int i = 0; i < capitalOutlayList.size(); i++) {
			
				CapitalOutlay acapOutlay = capitalOutlayList.get(i);
				form.setId(acapOutlay.getId());
				
				
				if (acapOutlay != null) {
					logger.debug(acapOutlay.getFiscalYear());

					CapitalOutlayGrid capitalOutlayGrid = new CapitalOutlayGrid();

					capitalOutlayGrid.setId(acapOutlay.getId());
					
					if (acapOutlay.getRelatedYear() != null)
						capitalOutlayGrid.setRelatedYear(acapOutlay.getRelatedYear());
					capitalOutlayGrid.setTotalPurchasePrice(acapOutlay.getTotalPurchasePrice());
					capitalOutlayGrid.setDepreciationCycle(acapOutlay
							.getDepreciationCycle());
					capitalOutlayGrid.setPrevDepreciatedAmt(acapOutlay
							.getPrevDepreciatedAmt());
					capitalOutlayGrid.setRemainingAmt(acapOutlay
							.getRemainingAmt());
					capitalOutlayGrid.setDepreciationPy(acapOutlay.getDepreciationPy());
					capitalOutlayGrid.setOutlayExclusion(acapOutlay
							.getOutlayExclusion());
					capitalOutlayGrid.setContractorMiles(acapOutlay
							.getContractorMiles());
					
					
					capitalOutlayGridList.add(capitalOutlayGrid);
				} else {
					logger.debug("Capital list is null");
				}
			}

		} else {
			long lfiscalYear = Long.parseLong(fiscalYear.substring(4)) - 1;
			long startFiscalYear = lfiscalYear - 9;
			logger.debug("The capital outlist list is null or 0 length");
			for (int i = 0; i <10; i++) {
				CapitalOutlayGrid capitalOutlayGrid = new CapitalOutlayGrid();
				capitalOutlayGrid.setRelatedYear(startFiscalYear);
				startFiscalYear++;
				capitalOutlayGridList.add(capitalOutlayGrid);
			}

		}
		form.setCapitalOutlayTotalFunding(getCapitalOutlayTotal(districtNos, fiscalYear));
		
		return form;
	}

	private double getCapitalOutlayTotal(String districtNos,  String fiscalYear) {
		Double capitalOutlayTotal = null;
		List<Transportation> transportationList = transportationDAO.getByDistrictAndYear(districtNos, fiscalYear);
		if (transportationList != null && transportationList.size() > 0) {
			if (transportationList.get(0) != null)
			capitalOutlayTotal = transportationList.get(0).getCapOutTran();
			
		}
		return (capitalOutlayTotal == null) ? 0 : capitalOutlayTotal.doubleValue();		
	}
	
	private void setTransportationCapOutTotal(String districtNos,  String fiscalYear, double capitalOutlayTotal ) {
		
	}
	
	public CapitalOutlayForm setupForm(long id) {
		CapitalOutlay obj = findById(CapitalOutlay.class, id);

		if (obj == null) {
			obj = new CapitalOutlay();

		}
		CapitalOutlayForm form = new CapitalOutlayForm();
		
		return form;
	}
	
	public boolean isCapitalOutlayDistricts(String fiscalYear, String districtNos) {
		
		fiscalYear = DateUtil.getPrevFiscalYear(fiscalYear);
		boolean isCapitalOutlayDistrict = false;
		List<String> coDistricts = transportationDAO.getCapitalOutlayDistricts(fiscalYear);
		for(String district : coDistricts) {
			
			if (districtNos.equals(district)) {
				isCapitalOutlayDistrict = true;
				break;
			}
		}
		return isCapitalOutlayDistrict;
	}


	public void setCapitalOutlayDAO(ICapitalOutlayDAO capitalOutlayDAO) {
		this.capitalOutlayDAO = capitalOutlayDAO;
	}

}
