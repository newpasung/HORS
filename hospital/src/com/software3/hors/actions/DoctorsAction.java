package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.software3.hors.dao.DoctorDaoInterf;
import com.software3.hors.domain.Doctor;

import utils.DateUtil;

public class DoctorsAction extends BasicAction {

	private long departmentId;
	private ArrayList<String> daysList;
	private List<Doctor> doctors;
	private DoctorDaoInterf doctorDao;
	private Map<Long, List<Boolean>> hasArrangements;

	@Override
	public String execute() throws Exception {
		if (getDepartmentId() == 0) {
			List<String> errors = new ArrayList<String>();
			errors.add("无参数");
			setActionErrors(errors);
			return "input";
		}
		
		daysList = DateUtil.next7Days();
		hasArrangements = new HashMap<Long, List<Boolean>>();
		doctors = doctorDao.getDocsByDepId(departmentId);
		for (Doctor doctor : doctors) {
			List<Boolean> tempHasArrangements = doctorDao.getHasArrangement(doctor.getDocId());
			hasArrangements.put(doctor.getDocId(), tempHasArrangements);
		}
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

	public ArrayList<String> getDaysList() {
		return daysList;
	}

	public void setDaysList(ArrayList<String> daysList) {
		this.daysList = daysList;
	}

	public Map<Long, List<Boolean>> getHasArrangements() {
		return hasArrangements;
	}

	public void setHasArrangements(Map<Long, List<Boolean>> hasArrangements) {
		this.hasArrangements = hasArrangements;
	}
	
	

}
