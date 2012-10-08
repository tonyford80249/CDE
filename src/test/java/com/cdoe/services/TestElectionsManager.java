
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

import com.cdoe.services.IElectionsManager;
import com.cdoe.biz.model.ElectionsDetail;
import com.cdoe.biz.model.Election;
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
public class TestElectionsManager extends AbstractTransactionalJUnit4SpringContextTests {
	
	private static final Logger logger = Logger.getLogger(TestElectionsManager.class);
	
	@Autowired
	private IElectionsManager electionsManager;
	

	@Test
	public void testElectionsDetail() {
		final List<ElectionsDetail> list = electionsManager.findAll(ElectionsDetail.class);
		int size1 = list.size();
		
		/* test create */
		final ElectionsDetail electionsDetail = new ElectionsDetail();
		long id = electionsManager.create(electionsDetail);
		
		/* test find */
		final ElectionsDetail electionsDetail2 = electionsManager.findById(ElectionsDetail.class, id);
		long id2 = electionsDetail2.getId();
		assertEquals(id, id2);
		
		/* test find all */
		final List<ElectionsDetail> list2 = electionsManager.findAll(ElectionsDetail.class);
		int size2 = list2.size();
		assertEquals(size2, size1 + 1);
		
		/* test delete */
		electionsManager.delete(ElectionsDetail.class, id);
		final List<ElectionsDetail> list3 = electionsManager.findAll(ElectionsDetail.class);
		int size3 = list3.size();
		assertEquals(size1, size3);
	}

	@Test
	public void testElection() {
		final List<Election> list = electionsManager.findAll(Election.class);
		int size1 = list.size();
		
		/* test create */
		final Election election = new Election();
		long id = electionsManager.create(election);
		
		/* test find */
		final Election election2 = electionsManager.findById(Election.class, id);
		long id2 = election2.getId();
		assertEquals(id, id2);
		
		/* test find all */
		final List<Election> list2 = electionsManager.findAll(Election.class);
		int size2 = list2.size();
		assertEquals(size2, size1 + 1);
		
		/* test delete */
		electionsManager.delete(Election.class, id);
		final List<Election> list3 = electionsManager.findAll(Election.class);
		int size3 = list3.size();
		assertEquals(size1, size3);
	}
	
}