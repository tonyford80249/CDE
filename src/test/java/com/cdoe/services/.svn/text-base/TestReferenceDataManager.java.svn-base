package com.cdoe.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:applicationContext.xml",
	"classpath:applicationContext-tx.xml",
	"classpath:applicationContext-data.xml",
	"classpath:applicationContext-dao.xml",
	"classpath:applicationContext-hbm.xml",
	"classpath:applicationContext-service.xml",
	"classpath:applicationContext.xml"}, inheritLocations = true)
@TransactionConfiguration(transactionManager = "defaultTransactionManger")
public class TestReferenceDataManager {
	
	@Autowired
	private IReferenceDataManager referenceDataManager;

	@Test
	public void testGetDistrictName() {
		String name = referenceDataManager.getDistrictName("0880");
		assertNotNull(name);
	}

	@Test
	public void testGetDistrictReference() {
		Map<String, String> districts = referenceDataManager.getDistrictReference();
		assertNotNull(districts);
		for (String districtNum : districts.keySet()) {
			System.out.println("District: " + districtNum + ": " + districts.get(districtNum));
		}
		System.out.println("Total: " + districts.size());
	}

	@Test
	public void testGetMonthList() {
		List<String> months = referenceDataManager.getMonthList();
		assertNotNull(months);
		assertTrue(months.size() == 12);
	}

}
