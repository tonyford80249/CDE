
package com.cdoe.biz.impl;

import org.apache.log4j.Logger;

import com.cdoe.biz.IValidateSASIDsDAO;
import com.cdoe.db.hibernate.HibernateDAO;

public class ValidateSASIDsDAO extends HibernateDAO  implements IValidateSASIDsDAO {

	private static final Logger logger = Logger.getLogger(ValidateSASIDsDAO.class);
	
}
