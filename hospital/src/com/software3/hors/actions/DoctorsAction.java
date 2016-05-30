package com.software3.hors.actions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.dao.DoctorDaoInterf;
import com.software3.hors.domain.Doctor;
import com.software3.hors.domain.WorkArrangement;

public class DoctorsAction extends ActionSupport {

	private long departmentId;
	private List<Doctor> doctors;
	private DoctorDaoInterf doctorDao;
	// key是医生的id，值是一个链表，一般没数据是size=0
	private Map<Long, List<WorkArrangement>> workArrangements;
	// 通过work_argmid做key，值是时间段内剩余人数
	private Map<Long, Integer> peopleRemain;

	@Override
	public String execute() throws Exception {
		if (getDepartmentId() == 0) {
			List<String> errors = new ArrayList<String>();
			errors.add("无参数");
			setActionErrors(errors);
			return "input";
		}
		doctors = doctorDao.getDocsByDepId(departmentId);
		peopleRemain = new HashMap<Long, Integer>();
		workArrangements = new HashMap<Long, List<WorkArrangement>>();
		for (Doctor doctor : doctors) {
			List<WorkArrangement> tempArrangements =doctorDao.getWeekArrangements(doctor.getDocId());
			workArrangements.put(doctor.getDocId(), tempArrangements);
			List<Object[]> peopleCount = doctorDao.getCurrentPeopleCount(doctor
					.getDocId());
			// 初始化剩余人数为可接诊总人数
			for (WorkArrangement arrangement : tempArrangements) {
				peopleRemain.put(arrangement.getWork_argmid(),
						arrangement.getTotal_people());
			}
			// 根据已经预约或者已经接诊的人数算出剩余人数，覆盖掉初始值
			for (Object[] array : peopleCount) {
				// 第一个元素是work_argmid,第二个元素是预约人数
				BigInteger work_argmid = (BigInteger) array[0];
				if (peopleRemain.containsKey(work_argmid)) {
					int peopleRemaining = peopleRemain.get(work_argmid)
							- (Integer) array[1];
					peopleRemain.put(work_argmid.longValue(), peopleRemaining);
				}
			}
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

	public Map<Long, List<WorkArrangement>> getWorkArrangements() {
		return workArrangements;
	}

	public void setWorkArrangements(
			Map<Long, List<WorkArrangement>> workArrangements) {
		this.workArrangements = workArrangements;
	}

	public Map<Long, Integer> getPeopleRemain() {
		return peopleRemain;
	}

	public void setPeopleRemain(Map<Long, Integer> peopleRemain) {
		this.peopleRemain = peopleRemain;
	}

}
