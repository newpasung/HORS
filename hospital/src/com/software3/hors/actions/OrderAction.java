package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.constats.SessionName;
import com.software3.hors.dao.OrderDaoIntf;
import com.software3.hors.domain.Order;
import com.software3.hors.domain.User;

public class OrderAction extends ActionSupport {

	// 今天之后的第n天
	private int dayAfter;
	// 工作安排的id
	private long workargmId;

	private Order order;

	private OrderDaoIntf orderDao;

	@Override
	public String execute() throws Exception {

		// ////////////////// 测试用
		setDayAfter(1);
		setWorkargmId(1l);
		// //////////////////
		// 先获取真正的日期
		Calendar calendar = new GregorianCalendar(Locale.CHINA);
		calendar.add(Calendar.DAY_OF_MONTH, dayAfter);
		// 直接从session获取user
		User user = (User) ActionContext.getContext().getSession()
				.get(SessionName.USER);
		if (user == null) {
			return "fail";
		}
		Order tempOrder = orderDao.createOrder(calendar, workargmId, user);
		if (tempOrder != null) {
			setOrder(tempOrder);
			return "success";
		} else {
			List<String> errors = new ArrayList<String>();
			errors.add("提交预约申请失败");
			setActionErrors(errors);
			return "fail";
		}
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

}
