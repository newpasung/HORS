package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import com.opensymphony.xwork2.ActionContext;
import com.software3.hors.constats.SessionName;
import com.software3.hors.dao.OrderDaoIntf;
import com.software3.hors.domain.Order;
import com.software3.hors.domain.User;

public class OrderAction extends BasicAction {

	// 比今天延后n日
	private int dayAfter;
	// 工作安排id1
	private long workargmId;

	private Order order;

	private OrderDaoIntf orderDao;

	private List<Order> myOrders;

	@Override
	public String execute() throws Exception {

		// 获取实际的日期
		Calendar calendar = new GregorianCalendar(Locale.CHINA);
		calendar.add(Calendar.DATE, dayAfter);
		// 从session获取user对象
		User user = (User) ActionContext.getContext().getSession()
				.get(SessionName.USER);
		if (user == null) {
			List<String> errors = new ArrayList<String>();
			errors.add("未登陆不能预约");
			setActionErrors(errors);
			return "error";
		}
		Order tempOrder = orderDao.createOrder(calendar, workargmId, user);
		if (tempOrder != null) {
			setOrder(tempOrder);
			return "success";
		} else {
			setActionErrors(strs2List("无法创建预约"));
			return "error";
		}
	}

	public String myOrders() {
		// 从session获取user
		User user = (User) ActionContext.getContext().getSession().get(SessionName.USER);
		if (user == null) {
			setActionErrors(strs2List("请先登录再查看预约记录"));
			return "error";
		}
		setMyOrders(orderDao.findAllByUid(user.getId()));
		return "success";
	}

	public int getDayAfter() {
		return dayAfter;
	}

	public void setDayAfter(int dayAfter) {
		this.dayAfter = dayAfter;
	}

	public long getWorkargmId() {
		return workargmId;
	}

	public void setWorkargmId(long workargmId) {
		this.workargmId = workargmId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderDaoIntf getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDaoIntf orderDao) {
		this.orderDao = orderDao;
	}

	public List<Order> getMyOrders() {
		return myOrders;
	}

	public void setMyOrders(List<Order> myOrders) {
		this.myOrders = myOrders;
	}

}
