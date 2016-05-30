package com.software3.hors.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="docid")
	private long docId;

	@Column(name = "name")
	private String Name;

	// 职称
	@Column(name="job_title")
	private String jobTitle;
	// 简介
	@Column(name="description")
	private String description;
	// 挂号费
	@Column(name = "guahaofei")
	private int guahaofei;
	//
	@Column(name = "zhenliaofei")
	private int zhenliaofei;
	// 部门id

	@ManyToOne(targetEntity=Department.class)
	@JoinColumn(name = "did", referencedColumnName = "did")
	private Department department;

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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
}
