package com.software3.hors.actions;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.dao.DoctorDaoInterf;
import com.software3.hors.domain.WorkArrangement;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import utils.DateUtil;

public class WorkArrangementDataAction extends ActionSupport {
	private long doctorId;
	private int dayId;
	private DoctorDaoInterf doctorDao;
	private List<WorkArrangement> workArrangements;
	private String result;
	
	@Override
	public String execute() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, dayId);
		
		JSONObject jsObject = new JSONObject();
		workArrangements = doctorDao.getWorkArrangementsByWeekDay(DateUtil.getDayOfWeekday(cal), doctorId);
		JSONArray arrangementsArray = JSONArray.fromObject(workArrangements);
		jsObject.put("arrangements", arrangementsArray);
		
		JSONArray remainArray = new JSONArray();
		for (WorkArrangement arrangement: workArrangements) {
			int remain = arrangement.getTotal_people() - doctorDao.getOrderNumber(cal, arrangement.getWork_argmid());
			remainArray.add(remain);
		}
		jsObject.put("remain", remainArray);
		
		result = jsObject.toString();
		
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


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
