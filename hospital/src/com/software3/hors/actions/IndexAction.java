package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.software3.hors.dao.BaseDao;
import com.software3.hors.domain.Hospital;

public class IndexAction extends ActionSupport {

	// key是地区，value是医院名
	private Map<String, List<String>> hospitals;
	private BaseDao hospitalDao;
	@Override
	public String execute() throws Exception {
		// 读取所有的医院，并把医院信息包装成map
		List hospitals = hospitalDao.findAll(Hospital.class);
		Map<String, List<String>> tempHospitals = new HashMap<String, List<String>>();
		for(Object object : hospitals){
			Hospital hospital = (Hospital) object;
			if (tempHospitals.containsKey(hospital.getLocation())) {
				tempHospitals.get(hospital.getLocation())
						.add(hospital.getName());
			}else{
				List<String> arrayList = new ArrayList<String>();
				arrayList.add(hospital.getName());
				tempHospitals.put(hospital.getLocation(), arrayList);
			}
		}
		setHospitals(tempHospitals);
		return "success";
	}

	public Map<String, List<String>> getHospitals() {
		return hospitals;
	}

	public void setHospitals(Map<String, List<String>> hospitals) {
		this.hospitals = hospitals;
	}

	public BaseDao getHospitalDao() {
		return hospitalDao;
	}

	public void setHospitalDao(BaseDao hospitalDao) {
		this.hospitalDao = hospitalDao;
	}

}
