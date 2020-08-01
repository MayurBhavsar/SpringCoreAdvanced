package com.mayur.spring.springcoreadvanced.standalone_collection;

import java.util.List;
import java.util.Map;

public class OneDay {

	private List<String> playes;
	private Map<String, String> skills;

	public Map<String, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}

	public List<String> getPlayes() {
		return playes;
	}

	public void setPlayes(List<String> playes) {
		this.playes = playes;
	}

	@Override
	public String toString() {
		return "OneDay [playes=" + playes + ", skills=" + skills + "]";
	}

}
