package com.software3.hors.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "work_arrangement")
public class WorkArrangement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "work_argmid")
	private long work_argmid;

	@ManyToOne
	@JoinColumn(name = "docid", referencedColumnName = "docid")
	private Doctor doctor;

	// 周几的编号，1-7
	@Column(name = "weekday_num")
	private int weekday_num;

	// 一个时间段开始时间，整点为单位
	@Column(name = "start_num")
	private int start_num;

	// 结束时间
	@Column(name = "end_num")
	private int end_num;

	// 可接诊总人数
	@Column(name = "total_people")
	private int total_people;

	public long getWork_argmid() {
		return work_argmid;
	}

	public void setWork_argmid(long work_argmid) {
		this.work_argmid = work_argmid;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public int getWeekday_num() {
		return weekday_num;
	}

	public void setWeekday_num(int weekday_num) {
		this.weekday_num = weekday_num;
	}

	public int getStart_num() {
		return start_num;
	}

	public void setStart_num(int start_num) {
		this.start_num = start_num;
	}

	public int getEnd_num() {
		return end_num;
	}

	public void setEnd_num(int end_num) {
		this.end_num = end_num;
	}

	public int getTotal_people() {
		return total_people;
	}

	public void setTotal_people(int total_people) {
		this.total_people = total_people;
	}

}
