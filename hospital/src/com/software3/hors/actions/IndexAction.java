package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.software3.hors.dao.BaseDao;
import com.software3.hors.domain.Hospital;

public class IndexAction extends BasicAction {


	private Map<String, List<Hospital>> hospitals;
	private BaseDao hospitalDao;
	@Override
	public String execute() throws Exception {

		List hospitals = hospitalDao.findAll(Hospital.class);
		Map<String, List<Hospital>> tempHospitals = new HashMap<String, List<Hospital>>();
		for(Object object : hospitals){
			Hospital hospital = (Hospital) object;
			if (tempHospitals.containsKey(hospital.getLocation())) {
				tempHospitals.get(hospital.getLocation())
.add(hospital);
			}else{
				List<Hospital> arrayList = new ArrayList<Hospital>();
				arrayList.add(hospital);
				tempHospitals.put(hospital.getLocation(), arrayList);
			}
		}
		setHospitals(tempHospitals);
		return "success";
	}

	public Map<String, List<Hospital>> getHospitals() {
		return hospitals;
	}

	public void setHospitals(Map<String, List<Hospital>> hospitals) {
		this.hospitals = hospitals;
	}


	public BaseDao getHospitalDao() {
		return hospitalDao;
	}

	public void setHospitalDao(BaseDao hospitalDao) {
		this.hospitalDao = hospitalDao;
	}

}
