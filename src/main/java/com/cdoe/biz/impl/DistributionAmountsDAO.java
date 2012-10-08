package com.cdoe.biz.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.cdoe.biz.IDistributionAmountsDAO;
import com.cdoe.biz.model.Prorate;
import com.cdoe.biz.model.Transportation;
import com.cdoe.db.hibernate.HibernateDAO;

@SuppressWarnings("unchecked")
public class DistributionAmountsDAO extends HibernateDAO implements
		IDistributionAmountsDAO {

	private static final Logger logger = Logger
			.getLogger(DistributionAmountsDAO.class);

	public List<Prorate> getByDistrictAndYear(final String districtNos,
			final String fiscalYear) {
		return getHibernateTemplate().executeFind(
				new HibernateCallback<List<Prorate>>() {

					@Override
					public List<Prorate> doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session
								.createQuery("FROM Prorate c WHERE c.fiscalYear = :fiscalYear");
						query.setString("fiscalYear", fiscalYear);
						logger.info("fiscalYear val -->" + fiscalYear);
						return (List<Prorate>) query.list();
					}
				});

	}
	
	public int updateProrateNote(String fiscalYear, String fundingSources) {
		Session session = getCurrentSession();

		String hql = "UPDATE Prorate set fundingSources = :fundingSources " +
											 "WHERE  fiscalYear = :fiscalYear ";
		Query query = session.createQuery(hql);
		query.setParameter("fiscalYear", fiscalYear);
		query.setParameter("fundingSources", fundingSources);
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		return result;
		
	}
    /*
	public List<Object[]> getCDE40TotalByFiscalYear(final String fiscalYear) {

		// TODO Auto-generated method stub
		Session session = getCurrentSession();

		Query query = session
				.createQuery("Select sum(c.operTran), sum(c.netCurrentOperExpend), "
						+ "sum(c.migMiles), sum(c.regDMiles),  sum(c.schoolDays), "
						+ "sum(c.boardTran), sum(c.actMiles), sum(c.totalMiles)  "
						+ " FROM Transportation c WHERE c.fiscalYear = :fiscalYear");

		query.setParameter("fiscalYear", fiscalYear);
		List<Object[]> resultList = query.list();
		// System.out.println("Rows affected: " + result);
		System.out.println(" resultList " + resultList.get(0));
		Object[] res = resultList.get(0);
		System.out.println(" res 0 " + res[0]);
		System.out.println(" res 1 " + res[1]);
		System.out.println(" res 2 " + res[2]);
		System.out.println(" res 3 " + res[3]);
		double operTran = ((Double)res[0]).doubleValue();
		System.out.println(" operTran " +  operTran);
		return resultList;

	}*/
	
	public List<Object[]> getCDE40TotalByFiscalYear(final String fiscalYear) {
		
		Session session = getCurrentSession();

		String hql = "Select sum(advPay), sum(reimEntitlement) " + 
				"       from Transportation " +
					   "  where fiscalYear = :fiscalYear ";
		Query query = session.createQuery(hql);
		query.setParameter("fiscalYear", fiscalYear);
		List<Object[]> resultList = query.list();
		// System.out.println("Rows affected: " + result);
		System.out.println(" resultList " + resultList.get(0));
		Object[] res = resultList.get(0);
		System.out.println(" res 0 " + res[0]);
		System.out.println(" res 1 " + res[1]);
		double advPay = ((Double)res[0]).doubleValue();
		System.out.println(" advPay " +  advPay);
		return resultList;
		
	
		
	}

}
