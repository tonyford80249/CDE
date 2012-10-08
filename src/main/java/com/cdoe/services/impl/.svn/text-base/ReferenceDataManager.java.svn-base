package com.cdoe.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cdoe.biz.IDistrictDetailDAO;
import com.cdoe.biz.impl.StateEqualMasterDAO;
import com.cdoe.biz.model.OrganizationUnitMaster;
import com.cdoe.services.IReferenceDataManager;

/**
 * This service provides access to reference data in
 * the application.  This is data that is maintained in the
 * database but that doesn't change very often, and is shared
 * between all of the applications
 * 
 * @author dyn-8
 *
 */
public class ReferenceDataManager implements IReferenceDataManager {
	
	private final Logger logger = Logger.getLogger(ReferenceDataManager.class);
	private HashMap<String, String> districtReference;

	private IDistrictDetailDAO districtsDao;
	private StateEqualMasterDAO stateEqualMasterDao;

	public ReferenceDataManager() {
		super();
	}
	
	public void setDistrictsDao(IDistrictDetailDAO districtsDao) {
		this.districtsDao = districtsDao;
	}

	public void setStateEqualMasterDao(StateEqualMasterDAO stateEqualMasterDao) {
		this.stateEqualMasterDao = stateEqualMasterDao;
	}

	/**
	 * This will initialize the internal district list after
	 * the bean is constructed
	 */
	public void init() {
		loadDistricts();
	}
	
	/**
	 * Returns the district name for the given code
	 * @param orgCode
	 * @return
	 */
	public String getDistrictName(String orgCode) {
		return districtReference.get(orgCode);
		
	}

	/**
	 * Returns the district reference map
	 * @return
	 */
	public Map<String, String> getDistrictReference() {
		return districtReference;
	}
	
	/**
	 * Returns the list of months from the State_Equal_Master table
	 * @return
	 */
	public List<String> getMonthList() {
		return stateEqualMasterDao.getElementValueList("Month_Of_a_Year");
	}
	
	/**
	 * Returns the list of Crosswalk Data Types
	 * @return
	 */
	public List<String> getCrosswalkDataType() {
		return stateEqualMasterDao.getElementValueList("CROSSWALK_DATA_TYPE");
	}
	
	/**
	 * Returns the list of District Entitlement Calculation periods
	 * @return
	 */
	public List<String> getDistrictEntitlementPeriod() {
		return stateEqualMasterDao.getElementValueList("DIST_ENTL_CALC_PERIOD");
	}

	/**
	 * Returns the list of State Share Adjustments
	 * @return
	 */
	public List<String> getStateShareAdjustments() {
		return stateEqualMasterDao.getElementValueList("STATE_SHARE_ADJUSTMENTS");
	}
	
	/**
	 * Returns the last payment date
	 * @return
	 */
	public String getLastPaymentDate() {
		return stateEqualMasterDao.getElementValueList("PAYMENT_DATE").get(0);
	}
	
	/**
	 * Returns the list of Capital outlay districts 
	 * @return
	 */
	public List<String> getCrossWalkDataType() {
		return stateEqualMasterDao.getElementValueList("CROSSWALK_DATA_TYPE");
	}
	
	//
	// Private methods
	//

	/**
	 * Loads the districts into the internal reference map
	 */
	private void loadDistricts() {
		List<OrganizationUnitMaster> districts = districtsDao.getAllDistricts();
		 districtReference = new HashMap<String, String>();
		for (OrganizationUnitMaster district : districts) {
			logger.debug("Organizational Code " + district.getOrganizationCode());
			logger.debug("Organizational Name " + district.getOrganizationName());
			districtReference.put(district.getOrganizationCode(), district.getOrganizationName());
			
		}
	}
	
	
	
}