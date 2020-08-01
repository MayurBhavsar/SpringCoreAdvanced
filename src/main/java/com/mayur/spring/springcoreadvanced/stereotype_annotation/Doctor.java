package com.mayur.spring.springcoreadvanced.stereotype_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

	@Value("Gajre")
	private String name;
	@Value("Heart Specilist")
	private String skill;

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", skill=" + skill + "]";
	}

}
