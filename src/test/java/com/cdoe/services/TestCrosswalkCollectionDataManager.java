
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

import com.cdoe.services.ICrosswalkCollectionDataManager;
import com.cdoe.biz.model.CollectionType;
import com.cdoe.biz.model.StateEqual;
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
public class TestCrosswalkCollectionDataManager extends AbstractTransactionalJUnit4SpringContextTests {
	
	private static final Logger logger = Logger.getLogger(TestCrosswalkCollectionDataManager.class);
	
	@Autowired
	private ICrosswalkCollectionDataManager crosswalkCollectionDataManager;
	

	@Test
	public void testCollectionType() {
		final List<CollectionType> list = crosswalkCollectionDataManager.findAll(CollectionType.class);
		int size1 = list.size();
		
		/* test create */
		final CollectionType collectionType = new CollectionType();
		long id = crosswalkCollectionDataManager.create(collectionType);
		
		/* test find */
		final CollectionType collectionType2 = crosswalkCollectionDataManager.findById(CollectionType.class, id);
		long id2 = collectionType2.getId();
		assertEquals(id, id2);
		
		/* test find all */
		final List<CollectionType> list2 = crosswalkCollectionDataManager.findAll(CollectionType.class);
		int size2 = list2.size();
		assertEquals(size2, size1 + 1);
		
		/* test delete */
		crosswalkCollectionDataManager.delete(CollectionType.class, id);
		final List<CollectionType> list3 = crosswalkCollectionDataManager.findAll(CollectionType.class);
		int size3 = list3.size();
		assertEquals(size1, size3);
	}

	@Test
	public void testStateEqual() {
		final List<StateEqual> list = crosswalkCollectionDataManager.findAll(StateEqual.class);
		int size1 = list.size();
		
		/* test create */
		final StateEqual stateEqual = new StateEqual();
		long id = crosswalkCollectionDataManager.create(stateEqual);
		
		/* test find */
		final StateEqual stateEqual2 = crosswalkCollectionDataManager.findById(StateEqual.class, id);
		long id2 = stateEqual2.getId();
		assertEquals(id, id2);
		
		/* test find all */
		final List<StateEqual> list2 = crosswalkCollectionDataManager.findAll(StateEqual.class);
		int size2 = list2.size();
		assertEquals(size2, size1 + 1);
		
		/* test delete */
		crosswalkCollectionDataManager.delete(StateEqual.class, id);
		final List<StateEqual> list3 = crosswalkCollectionDataManager.findAll(StateEqual.class);
		int size3 = list3.size();
		assertEquals(size1, size3);
	}
	
}