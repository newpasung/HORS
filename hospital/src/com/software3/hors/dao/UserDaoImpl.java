package com.software3.hors.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.software3.hors.domain.User;

@Transactional
public class UserDaoImpl extends BaseDaoHibernate4<User> implements
		UserDaoInterface<User> {

	@Override
	public User login(String username, String password) {
		String sql = "select * from user where name=:name and password=:password";
		List users = getSessionFactory().getCurrentSession()
		.createSQLQuery(sql)
				.addEntity(User.class).setString("name", username)
				.setString("password", password).list();
		if (users.size() == 0) {
			return null;
		} else {
			return (User) users.get(0);
		}
	}

}
