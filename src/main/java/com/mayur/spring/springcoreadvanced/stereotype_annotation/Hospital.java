package com.mayur.spring.springcoreadvanced.stereotype_annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hosp")
@Scope("prototype")
public class Hospital {

	@Autowired(required = true)
	private Doctor doctor;

	@Value("#{staff}")
	private List<String> staffList;

//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}
//
//	public List<String> getStaffList() {
//		return staffList;
//	}
//
//	public void setStaffList(List<String> staffList) {
//		this.staffList = staffList;
//	}

	@Override
	public String toString() {
		return "Hospital [doctor=" + doctor + ", staffList=" + staffList + "]";
	}

	
}
