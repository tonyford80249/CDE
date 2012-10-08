package com.cdoe.services;

import java.util.List;
import java.util.Map;

public interface IReferenceDataManager {

	public String getDistrictName(String orgCode);
	
	public Map<String, String> getDistrictReference();
	
	public List<String> getMonthList();
	
	public List<String> getCrosswalkDataType();
	
	public List<String> getDistrictEntitlementPeriod();
	
	public List<String> getStateShareAdjustments();
	
	public String getLastPaymentDate();
	
	public List<String> getCrossWalkDataType();
}
