package com.software3.hors.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.software3.hors.domain.Doctor;
import com.software3.hors.domain.Hospital;

@Transactional
public class HospitalDaoImpl extends BaseDaoHibernate4<Hospital> implements
		HospitalDaoInterf {

	@Override
	public Hospital findById(long id) {
		String sqlString = "select * from hospital where hid=:hid";
		List hospitals = getSessionFactory().getCurrentSession()
				.createSQLQuery(sqlString).addEntity(Hospital.class)
				.setLong("hid", id).list();
		return (Hospital)hospitals.get(0);
	}

}
