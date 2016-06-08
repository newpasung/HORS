package com.software3.hors.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.software3.hors.domain.User;

@Transactional
public abstract class BaseDaoHibernate4<T> implements BaseDao<T> {

	private SessionFactory sessionFactory;
	@Override
	public Serializable save(T entity) {
		return getSessionFactory().getCurrentSession().save(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> entityClass) {
		return getSessionFactory().getCurrentSession().createQuery(
						"select en from " + entityClass.getSimpleName() + " en")
				.list();
	}

	@Override
	public boolean update(T entity) {
		try {
			getSessionFactory().getCurrentSession().update(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getOneById(Class<T> entityClass, Serializable id) {
		return (T) getSessionFactory().getCurrentSession().get(entityClass, id);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
