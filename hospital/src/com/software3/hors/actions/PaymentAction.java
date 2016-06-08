package com.software3.hors.actions;

import com.software3.hors.dao.OrderDaoIntf;

public class PaymentAction extends BasicAction {

	private long orderId;
	private OrderDaoIntf orderDao;
	@Override
	public String execute() throws Exception {
		if (orderDao.pay(orderId)) {
			return "success";
		}
		else{
			setActionErrors(strs2List("付款失败"));
			return "error";
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
