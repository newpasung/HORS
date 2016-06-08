package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.constats.SessionName;
import com.software3.hors.dao.OrderDaoIntf;
import com.software3.hors.domain.Order;
import com.software3.hors.domain.User;
import com.software3.hors.domain.Order.OrderStatus;

public class CancelOrderAction extends ActionSupport {
	private long orderId;
	private OrderDaoIntf orderDao;
	private Map<String,Object> map = new HashMap<String, Object>();
	
	@Override
	public String execute() throws Exception {
		User user = (User) ActionContext.getContext().getSession()
				.get(SessionName.USER);
		if (user == null) {
			map.put("success", "0");
			map.put("message", "未登陆不能进行该操作");
			System.out.println("a");
			return SUCCESS;
		}
		
		Order order = orderDao.getOneById(Order.class, orderId);
		if (order == null) {
			map.put("success", "0");
			map.put("message", "不存在该订单");
			System.out.println("c");
			return SUCCESS;
		}
		
		if (order.getStatus() == OrderStatus.FINISH 
			|| order.getStatus() == OrderStatus.CANCEL
			|| order.getStatus() == OrderStatus.EXPIRED) {
			map.put("success", "0");
			map.put("message", "该订单不能取消");
			return SUCCESS;
		}
		
		order.setStatus(OrderStatus.CANCEL);
		orderDao.update(order);
		map.put("success", "1");
		map.put("message", "成功订单取消");
		return SUCCESS;
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

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
	
	
}
