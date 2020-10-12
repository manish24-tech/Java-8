package com.practice.basic;

@FunctionalInterface
public interface SkillsUtil {

	// single abstract method
	void showSkill(String skillName);

	// multiple default methods
	default void profile() {
		System.out.println("SkillsUtil.profile()");
	}

	default void skillName(String skill) {
		System.out.println("Developer -> " + skill);
	}

	// multiple default methods
	static void skillOption() {
		System.out.println("static Method -> Direct Access : java, spring, hibernate, struts");
	}

	static void skillType(String type) {
		System.out.println("static Method -> Direct Access : " + type);
	}
}
