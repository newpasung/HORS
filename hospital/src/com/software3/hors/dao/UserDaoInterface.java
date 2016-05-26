package com.software3.hors.dao;


public interface UserDaoInterface<User> extends BaseDao<User> {
	User login(String username, String password);
}
