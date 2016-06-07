package com.software3.hors.dao;

import java.util.Calendar;

import com.software3.hors.domain.Order;
import com.software3.hors.domain.User;

public interface OrderDaoIntf extends BaseDao<Order> {

	Order createOrder(Calendar orderDay, long workargmId, User user);

	boolean pay(long orderId);
	
}
