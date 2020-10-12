package com.practice.stream;

public class Skill {

	private int skillId;
	private String skillName;
	private int ratting;

	public Skill(int skillId, String skillName, int ratting) {

		this.skillId = skillId;
		this.skillName = skillName;
		this.ratting = ratting;
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

	public int getRatting() {
		return ratting;
	}

	public void setRatting(int ratting) {
		this.ratting = ratting;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", ratting=" + ratting + "]";
	}

}
