package com.software3.hors.dao;

import java.util.List;

import com.software3.hors.domain.Doctor;

public interface DoctorDaoInterf extends BaseDao<Doctor> {

	List<Doctor> getDocsByDepId(long departmentId);

}
