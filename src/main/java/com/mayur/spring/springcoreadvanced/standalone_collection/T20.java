package com.mayur.spring.springcoreadvanced.standalone_collection;

import java.util.List;
import java.util.Map;

public class T20 {

	private List<String> playes;
	private Map<String, String> skills;

	public T20(List<String> playes, Map<String, String> skills) {
		super();
		this.playes = playes;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "T20 [playes=" + playes + ", skills=" + skills + "]";
	}

}
