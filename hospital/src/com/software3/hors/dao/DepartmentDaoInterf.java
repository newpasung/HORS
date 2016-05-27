package com.software3.hors.dao;

import java.util.List;

public interface DepartmentDaoInterf<T> extends BaseDao<T> {


	List getDepmentByHosId(long hid);
	
}
