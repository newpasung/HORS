package com.software3.hors.dao;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HospitalDaoImpl<T> extends BaseDaoHibernate4<T> implements
		BaseDao<T> {

}
