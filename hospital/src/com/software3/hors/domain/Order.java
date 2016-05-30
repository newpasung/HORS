package com.software3.hors.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderid")
	private long orderId;

	@Enumerated(EnumType.STRING)
	@Column(name = "order_status")
	private OrderStatus status;

	// 只存放日期
	@Column(name = "order_date")
	@Temporal(TemporalType.DATE)
	private Date date;

	// 从这里得到时间段等信息
	@ManyToOne
	@JoinColumn(name = "work_argmid")
	private WorkArrangement workArrangement;

	enum OrderStatus {
		WAITFORPAY, WAITFORCURE, FINISH, CANCEL
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public WorkArrangement getWorkArrangement() {
		return workArrangement;
	}

	public void setWorkArrangement(WorkArrangement workArrangement) {
		this.workArrangement = workArrangement;
	}

}
