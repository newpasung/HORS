package com.software3.hors.dao;

import java.util.List;

import com.software3.hors.domain.Doctor;
import com.software3.hors.domain.WorkArrangement;

public interface DoctorDaoInterf extends BaseDao<Doctor> {

	List<Doctor> getDocsByDepId(long departmentId);

	List<WorkArrangement> getWeekArrangements(long docId);
	
	List<Boolean> getHasArrangement(long docId);

	List<Object[]> getCurrentPeopleCount(long docId);

}
