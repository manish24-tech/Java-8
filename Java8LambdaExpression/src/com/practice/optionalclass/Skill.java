package com.practice.optionalclass;

public class Skill {
	
	private int id;
	private String name;
	private int ratting;
	
	public Skill(int id, String name, int ratting) {
		this.id = id;
		this.name = name;
		this.ratting = ratting;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRatting() {
		return ratting;
	}
	public void setRatting(int ratting) {
		this.ratting = ratting;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", ratting=" + ratting + "]";
	}
	
}
