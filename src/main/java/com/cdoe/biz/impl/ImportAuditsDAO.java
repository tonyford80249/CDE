
package com.cdoe.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cdoe.biz.IImportAuditsDAO;
import com.cdoe.db.hibernate.HibernateDAO;
import com.cdoe.biz.model.AuditEqual;

public class ImportAuditsDAO extends HibernateDAO  implements IImportAuditsDAO {

	private static final Logger logger = Logger.getLogger(ImportAuditsDAO.class);
	
}
