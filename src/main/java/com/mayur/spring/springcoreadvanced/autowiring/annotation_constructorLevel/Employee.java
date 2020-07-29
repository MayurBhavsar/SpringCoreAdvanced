package com.mayur.spring.springcoreadvanced.autowiring.annotation_constructorLevel;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;

	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
