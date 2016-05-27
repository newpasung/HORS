package com.software3.hors.dao;

import com.software3.hors.domain.Hospital;

public interface HospitalDaoInterf extends BaseDao<Hospital> {
	Hospital findById(long id);
}
