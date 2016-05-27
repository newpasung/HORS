package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.dao.DepartmentDaoInterf;
import com.software3.hors.domain.Department;

public class DepartmentsAction extends ActionSupport {

	private long hospitalId;
	private List<Department> departments;
	private DepartmentDaoInterf<Department> departmentDao;
	@Override
	public String execute() throws Exception {
		if (getHospitalId() == 0) {
			List<String> errors = new ArrayList<String>();
			errors.add("Ã»ÓÐ´«µÝhospitalId");
			setActionErrors(errors);
			return "input";
		}
		departments = departmentDao.getDepmentByHosId(hospitalId);
		return "success";
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public DepartmentDaoInterf<Department> getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDaoInterf<Department> departmentDao) {
		this.departmentDao = departmentDao;
	}

}
