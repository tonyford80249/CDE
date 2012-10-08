/**
 * 
 */
package com.cdoe.biz.impl;

import java.util.ArrayList;
import java.util.List;

import com.cdoe.biz.model.StateEqualMaster;
import com.cdoe.db.hibernate.HibernateDAO;

/**
 * DAO class for STATE_EQUAL_MASTER
 * @author dyn-8
 *
 */
public class StateEqualMasterDAO extends HibernateDAO {

	/**
	 * Default constructor
	 */
	public StateEqualMasterDAO() {
		super();
	}
	
	@SuppressWarnings("unchecked")
	public List<StateEqualMaster> findByGroupName(String groupName) {
		return getHibernateTemplate()
				.findByNamedParam(
						"from StateEqualMaster where groupName = :groupName and active = 'Y'",
						"groupName", groupName);
	}
	
	/**
	 * Convenience method to return the element values as a list 
	 * of strings
	 * 
	 * @param groupName
	 * @return
	 */
	public List<String> getElementValueList(String groupName) {
		ArrayList<String> values = null;
		List<StateEqualMaster> masterList = findByGroupName(groupName);
		if (masterList != null) {
			values = new ArrayList<String>();
			for (StateEqualMaster master : masterList) {
				values.add(master.getElementValue());
			}
		}
		return values;
	}

}
