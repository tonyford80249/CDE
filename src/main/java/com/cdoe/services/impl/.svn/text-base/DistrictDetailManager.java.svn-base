package com.cdoe.services.impl;

import java.util.List;

import com.cdoe.biz.IDistrictDetailDAO;
import com.cdoe.biz.impl.DistrictDetailDAO;
import com.cdoe.biz.model.OrganizationUnitMaster;
import com.ctc.wstx.util.SimpleCache;


class DistrictDetailManager {
	static SimpleCache districtCache;
	private IDistrictDetailDAO districtDetailDAO;
	
	
	
	public void setDistrictDetailDAO(IDistrictDetailDAO districtDetailDAO) {
		this.districtDetailDAO = districtDetailDAO;
	}



	void fillDistrictCache() {
		districtDetailDAO = new DistrictDetailDAO();
		districtCache = new SimpleCache(100);
		List<OrganizationUnitMaster> districts = districtDetailDAO.getAllDistricts();
		for (OrganizationUnitMaster district:districts ) {
		   districtCache.add(district.getOrganizationCode(), district.getOrganizationName());
		}
		
	}
	
	
	
	public static void  main(String[] args) {
		DistrictDetailManager  ddmanager = new DistrictDetailManager();
		ddmanager.fillDistrictCache();
		
	}

}
