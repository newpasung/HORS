package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.dao.DoctorDaoInterf;
import com.software3.hors.domain.Doctor;

public class DoctorsAction extends ActionSupport {

	private long departmentId;
	private List<Doctor> doctors;
	private DoctorDaoInterf doctorDao;
	@Override
	public String execute() throws Exception {
		if (getDepartmentId() == 0) {
			List<String> errors = new ArrayList<String>();
			errors.add("Ã»ÓÐ´«µÝdepartmentId");
			setActionErrors(errors);
			return "input";
		}
		doctors = doctorDao.getDocsByDepId(departmentId);
		return "success";
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public DoctorDaoInterf getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(DoctorDaoInterf doctorDao) {
		this.doctorDao = doctorDao;
	}

}
