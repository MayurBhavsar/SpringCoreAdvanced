package com.mayur.spring.springcoreadvanced.autowiring.annotation_qualifier;

public class Kitchen {

	int dabbe;
	int plates;
	public Kitchen(int dabbe, int plates) {
		super();
		this.dabbe = dabbe;
		this.plates = plates;
	}
	@Override
	public String toString() {
		return "Kitchen [dabbe=" + dabbe + ", plates=" + plates + "]";
	}
}
