package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.software3.hors.dao.DoctorDaoInterf;
import com.software3.hors.domain.WorkArrangement;

import utils.DateUtil;

public class WorkArrangementDataAction extends BasicAction {
	private long doctorId;
	private int dayId;
	private DoctorDaoInterf doctorDao;
	private List<WorkArrangement> workArrangements;
	private Map<String,Object> map = new HashMap<String, Object>();
	
	@Override
	public String execute() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, dayId);
		
		workArrangements = doctorDao.getWorkArrangementsByWeekDay(DateUtil.getDayOfWeekday(cal), doctorId);
		map.put("arrangements", workArrangements);
		
		List<Integer> remainList = new ArrayList<Integer>();
		for (WorkArrangement arrangement: workArrangements) {
			int remain = arrangement.getTotal_people() - doctorDao.getOrderNumber(cal, arrangement.getWork_argmid());
			remainList.add(remain);
		}
		map.put("remain", remainList);
		
		return SUCCESS;
	}


	public long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}


	public int getDayId() {
		return dayId;
	}


	public void setDayId(int dayId) {
		this.dayId = dayId;
	}


	public DoctorDaoInterf getDoctorDao() {
		return doctorDao;
	}


	public void setDoctorDao(DoctorDaoInterf doctorDao) {
		this.doctorDao = doctorDao;
	}


	public List<WorkArrangement> getWorkArrangements() {
		return workArrangements;
	}


	public void setWorkArrangements(List<WorkArrangement> workArrangements) {
		this.workArrangements = workArrangements;
	}

	public Map<String, Object> getMap() {
		return map;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
	
}
