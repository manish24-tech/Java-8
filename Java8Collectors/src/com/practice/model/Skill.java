package com.practice.model;

public class Skill {

	private int skillId;
	private String skillName;
	private int empid;

	public Skill(int skillId, String skillName, int empid) {
		this.skillId = skillId;
		this.skillName = skillName;
		this.empid = empid;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", empid=" + empid + "]";
	}

}
