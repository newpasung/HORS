package com.software3.hors.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.software3.hors.domain.Order;
import com.software3.hors.domain.Order.OrderStatus;
import com.software3.hors.domain.User;
import com.software3.hors.domain.WorkArrangement;

public class OrderDaoImpl extends BaseDaoHibernate4<Order> implements
		OrderDaoIntf {

	private DoctorDaoInterf doctorDao;
	@Override
	public Order createOrder(Calendar orderDay, long workargmId, User user) {
		int currentCount = doctorDao.getOrderNumber(orderDay, workargmId);
		WorkArrangement workArrangement = doctorDao.getArrangement(workargmId);
		if (workArrangement==null) {
			return null;
		}
		if (currentCount >= workArrangement.getTotal_people()) {
			return null;
		}
		Order order = new Order();
		order.setWorkArrangement(workArrangement);
		order.setStatus(OrderStatus.WAITFORPAY);
		order.setDate(orderDay.getTime());
		order.setUser(user);
		save(order);
		return order;
	}

	public DoctorDaoInterf getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(DoctorDaoInterf doctorDao) {
		this.doctorDao = doctorDao;
	}

	@Override
	public boolean pay(long orderId) {
		Order order = getOneById(Order.class, orderId);
		if (order == null || order.getStatus() != OrderStatus.WAITFORPAY) {
			return false;
		}
		order.setStatus(OrderStatus.WAITFORCURE);
		return update(order);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAllByUid(long uid) {
		String sql = "select * from orders where uid=:uid order by order_date DESC";
		List<Order> orders = getSessionFactory().getCurrentSession().createSQLQuery(sql).addEntity(Order.class).setLong("uid", uid)
				.list();
		Date today = new Date();
		for(Order order:orders) {
			if(order.getDate().before(today)) {
				if(order.getStatus() == OrderStatus.WAITFORPAY) {
					order.setStatus(OrderStatus.EXPIRED);
				} 
				else if (order.getStatus() == OrderStatus.WAITFORCURE) {
					order.setStatus(OrderStatus.FINISH);
				}
			}
		}
		
		return orders;
	}

}
