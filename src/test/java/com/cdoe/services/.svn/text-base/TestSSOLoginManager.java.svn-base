/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.services;

import org.apache.log4j.Logger;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import static org.junit.Assert.assertEquals;

import com.cdoe.services.ISSOLoginManager;
import com.cdoe.biz.model.VHeader;
import com.cdoe.biz.model.VData;
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
public class TestSSOLoginManager extends AbstractTransactionalJUnit4SpringContextTests {
	
	private static final Logger logger = Logger.getLogger(TestSSOLoginManager.class);
	
	@Autowired
	private ISSOLoginManager sSOLoginManager;
	

	@Test
	public void testVHeader() {
		final List<VHeader> list = sSOLoginManager.findAll(VHeader.class);
		int size1 = list.size();
		
		/* test create */
		final VHeader vHeader = new VHeader();
		long id = sSOLoginManager.create(vHeader);
		
		/* test find */
		final VHeader vHeader2 = sSOLoginManager.findById(VHeader.class, id);
		long id2 = vHeader2.getId();
		assertEquals(id, id2);
		
		/* test find all */
		final List<VHeader> list2 = sSOLoginManager.findAll(VHeader.class);
		int size2 = list2.size();
		assertEquals(size2, size1 + 1);
		
		/* test delete */
		sSOLoginManager.delete(VHeader.class, id);
		final List<VHeader> list3 = sSOLoginManager.findAll(VHeader.class);
		int size3 = list3.size();
		assertEquals(size1, size3);
	}

	@Test
	public void testVData() {
		final List<VData> list = sSOLoginManager.findAll(VData.class);
		int size1 = list.size();
		
		/* test create */
		final VData vData = new VData();
		long id = sSOLoginManager.create(vData);
		
		/* test find */
		final VData vData2 = sSOLoginManager.findById(VData.class, id);
		long id2 = vData2.getId();
		assertEquals(id, id2);
		
		/* test find all */
		final List<VData> list2 = sSOLoginManager.findAll(VData.class);
		int size2 = list2.size();
		assertEquals(size2, size1 + 1);
		
		/* test delete */
		sSOLoginManager.delete(VData.class, id);
		final List<VData> list3 = sSOLoginManager.findAll(VData.class);
		int size3 = list3.size();
		assertEquals(size1, size3);
	}
	
}