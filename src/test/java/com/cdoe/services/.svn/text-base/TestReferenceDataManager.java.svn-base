package com.cdoe.services;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.cdoe.services.impl.ReferenceDataManager;

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
	private ReferenceDataManager referenceDataManager;

	@Test
	public void testGetDistrictName() {
		String name = referenceDataManager.getDistrictName("0880");
		assertNotNull(name);
	}

	@Test
	public void testGetDistrictReference() {
		Map<String, String> districts = referenceDataManager.getDistrictReference();
		assertNotNull(districts);
		assertTrue("Number of districts was: " + districts.size(), districts.size() == 188);
	}

	@Test
	public void testGetMonthList() {
		List<String> months = referenceDataManager.getMonthList();
		assertNotNull(months);
		assertTrue(months.size() == 12);
	}

}
