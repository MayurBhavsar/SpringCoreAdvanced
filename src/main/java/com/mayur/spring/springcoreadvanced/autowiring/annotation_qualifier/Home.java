package com.mayur.spring.springcoreadvanced.autowiring.annotation_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Home {

	@Autowired
	@Qualifier("kitchen2")
	Kitchen kitchen;

	@Override
	public String toString() {
		return "Home [kitchen=" + kitchen + "]";
	}
}
