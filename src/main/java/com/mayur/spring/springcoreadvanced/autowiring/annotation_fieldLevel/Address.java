package com.mayur.spring.springcoreadvanced.autowiring.annotation_fieldLevel;

public class Address {

	private String street;
	private String city;

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	
}
