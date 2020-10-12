package com.practice.model;

public class Employee {
	
	private int id;
	private String name;
	private Double salary;
	private String skill;
	private boolean status;
	
	
	public Employee(int id, String name, Double salary, String skill, boolean status) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skill = skill;
		this.status = status;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", skill=" + skill + ", status="
				+ status + "]";
	}
}
