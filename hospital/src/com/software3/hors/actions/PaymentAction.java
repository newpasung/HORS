package com.software3.hors.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.dao.OrderDaoIntf;

public class PaymentAction extends ActionSupport {

	private long orderId;
	private OrderDaoIntf orderDao;
	@Override
	public String execute() throws Exception {
		if (orderDao.pay(orderId)) {
			return "success";
		}
		else{
			return "fail";
		}
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public OrderDaoIntf getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDaoIntf orderDao) {
		this.orderDao = orderDao;
	}

}
