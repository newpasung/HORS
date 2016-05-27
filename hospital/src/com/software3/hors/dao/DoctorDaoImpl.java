package com.software3.hors.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.software3.hors.domain.Doctor;

@Transactional
public class DoctorDaoImpl extends BaseDaoHibernate4<Doctor> implements
		DoctorDaoInterf {

	@Override
	public List<Doctor> getDocsByDepId(long departmentId) {
		String sqlString = "select * from doctor where did=:did";
		return getSessionFactory().getCurrentSession()
				.createSQLQuery(sqlString).addEntity(Doctor.class)
				.setLong("did", departmentId).list();
	}

}
