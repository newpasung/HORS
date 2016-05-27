package com.software3.hors.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="docid")
	private long docId;
	// 医生职称
	@Column(name="job_title")
	private String jobTitle;
	// 简介
	@Column(name="description")
	private String description;
	// 这个医生的挂号费
	@Column(name = "guahaofei")
	private int guahaofei;
	// 诊疗费
	@Column(name = "zhenliaofei")
	private int zhenliaofei;
	// 所在科室
	@ManyToOne(targetEntity=Department.class)
	@JoinColumn(name = "did", referencedColumnName = "did")
	private Department department;

	@OneToOne()
	@JoinColumn(name = "docid", referencedColumnName = "docid")
	private WeekSchedule weekSchedule;

	public WeekSchedule getWeekSchedule() {
		return weekSchedule;
	}

	public void setWeekSchedule(WeekSchedule weekSchedule) {
		this.weekSchedule = weekSchedule;
	}

	public long getDocId() {
		return docId;
	}

	public void setDocId(long docId) {
		this.docId = docId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGuahaofei() {
		return guahaofei;
	}

	public void setGuahaofei(int guahaofei) {
		this.guahaofei = guahaofei;
	}

	public int getZhenliaofei() {
		return zhenliaofei;
	}

	public void setZhenliaofei(int zhenliaofei) {
		this.zhenliaofei = zhenliaofei;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
