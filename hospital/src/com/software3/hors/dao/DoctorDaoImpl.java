package com.software3.hors.dao;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import org.springframework.transaction.annotation.Transactional;

import utils.DateUtil;

import com.software3.hors.domain.Doctor;
import com.software3.hors.domain.WorkArrangement;

@Transactional
public class DoctorDaoImpl extends BaseDaoHibernate4<Doctor> implements
		DoctorDaoInterf {

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> getDocsByDepId(long departmentId) {
		String sqlString = "select * from doctor where did=:did";
		return getSessionFactory().getCurrentSession()
				.createSQLQuery(sqlString).addEntity(Doctor.class)
				.setLong("did", departmentId).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WorkArrangement> getWeekArrangements(long docId) {
		String sqlString = "select *from work_arrangement where docid =:docid group by weekday_num,start_num ";
		return getSessionFactory().getCurrentSession()
				.createSQLQuery(sqlString).addEntity(WorkArrangement.class)
				.setLong("docid", docId).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkArrangement> getWorkArrangementsByWeekDay(int weekDayNum, long docId) {
		String sql = "SELECT * FROM work_arrangement WHERE weekday_num = :weekday_num and docid = :docid order by start_num";
		return getSessionFactory().getCurrentSession()
				.createSQLQuery(sql).addEntity(WorkArrangement.class)
				.setLong("weekday_num", weekDayNum)
				.setLong("docid", docId).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getCurrentPeopleCount(long docId) {
		SimpleDateFormat sdFormat = new SimpleDateFormat();
		sdFormat.applyPattern("yyyy-MM-dd");
		Calendar today = new GregorianCalendar(Locale.CHINA);
		Calendar senventhDayCalendar = new GregorianCalendar(Locale.CHINA);
		senventhDayCalendar.add(Calendar.DAY_OF_MONTH, 6);
		String sql = "SELECT work_arrangement.work_argmid ,count(*) as count "
				+ " from work_arrangement INNER JOIN orders "
				+ " on work_arrangement.work_argmid = orders.work_argmid "
				+ " and orders.order_date BETWEEN :today and :senventhday"
				+ " and docid= :docid and orders.order_status <> 3"
				+ "  GROUP BY weekday_num,start_num ";
		List list = getSessionFactory().getCurrentSession().createSQLQuery(sql)
				.addScalar("work_argmid").addScalar("count")
				.setDate("today", today.getTime())
				.setDate("senventhday", senventhDayCalendar.getTime())
				.setLong("docid", docId).list();
		return list;
	}
	
	@Override
	public int getOrderNumber(Calendar cal, long arrangementId) {
		String sql = "select count(*) as count from orders where order_date = :date and work_argmid = :arrangementId";
		List list = getSessionFactory().getCurrentSession().createSQLQuery(sql)
				.addScalar("count")
				.setDate("date", cal.getTime())
				.setLong("arrangementId", arrangementId)
				.list();
		return ((BigInteger)list.get(0)).intValue();
	}
	
	@Override
	public List<Boolean> getHasArrangement(long docId) {
		int[] next7WeekDays = DateUtil.next7WeekDays();
		List<Boolean> result = new ArrayList<Boolean>();
		String sql = "SELECT * FROM work_arrangement WHERE weekday_num = :weekDay and docid = :docid";
		for (int i: next7WeekDays) {
			List list = getSessionFactory().getCurrentSession().createSQLQuery(sql)
					.setInteger("weekDay", i)
					.setLong("docid", docId)
					.list();
			boolean hasArrangement = list.size() == 0 ? false : true;
			result.add(hasArrangement);
		}
		return result;
	}


	@Override
	public WorkArrangement getArrangement(long arrangemengId) {
		return (WorkArrangement) getSessionFactory().getCurrentSession().get(
				WorkArrangement.class, arrangemengId);
	}

}
