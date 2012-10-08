/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.biz.IHeaderDAO;
import com.cdoe.db.hibernate.HibernateDAO;
import com.cdoe.biz.model.VHeader;

public class HeaderDAO extends HibernateDAO  implements IHeaderDAO {

	private static final Logger logger = Logger.getLogger(HeaderDAO.class);
	
}
