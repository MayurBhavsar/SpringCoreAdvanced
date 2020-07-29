package com.mayur.spring.springcoreadvanced.autowiring.xmlconfig_constructor;


public class Employee {

	private Address address;


	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
