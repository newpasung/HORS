package com.software3.hors.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.software3.hors.domain.Department;

@Transactional
public class DepartmentDaoImpl extends
 BaseDaoHibernate4<Department> implements
		DepartmentDaoInterf<Department> {

	@Override
	public List getDepmentByHosId(long hid) {
		String sql = "select * from department where hid =:hid"; 
		List list =getSessionFactory().getCurrentSession()
				.createSQLQuery(sql)
				.addEntity(Department.class)
				.setLong("hid", hid)
				.list();
		return list;
	}


}
