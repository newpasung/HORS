package com.software3.hors.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	Serializable save(T entity);

	List<T> findAll(Class<T> entityClass);

	T getOneById(Class<T> entityClass, Serializable id);

}
