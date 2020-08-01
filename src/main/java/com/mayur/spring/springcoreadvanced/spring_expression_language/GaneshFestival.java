package com.mayur.spring.springcoreadvanced.spring_expression_language;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Bappa")
public class GaneshFestival {

	@Value("#{new String('Shree Sai Ganesh Mitra Mandal').toUpperCase()}") //object creation and member method call
	private String mandalName;

	@Value("#{T(String).valueOf(10)}")	//static method call
	private String murtiHeight;

	@Value("#{kkList}")					//Collection passing 
	private List<String> karykarteList;
	
	@Value("#{T(Boolean).TRUE}")	// static variable access and boolean type demo
	private boolean govPermission;

	@Override
	public String toString() {
		return "GaneshFestival [mandalName=" + mandalName + ", murtiHeight=" + murtiHeight + ", karykarteList="
				+ karykarteList + ", govPermission=" + govPermission + "]";
	}

}
