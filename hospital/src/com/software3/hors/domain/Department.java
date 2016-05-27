package com.software3.hors.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "did")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long did;
	@Column(name = "name")
	private String name;

	@ManyToOne(targetEntity = Hospital.class)
	@JoinColumn(name = "hid", referencedColumnName = "hid", nullable = false)
	private Hospital hospital;

	@OneToMany(mappedBy = "department")
	private Set<Doctor> doctors;

	public long getDid() {
		return did;
	}

	public void setDid(long did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}
