package com.practice.basic;

public class Developer implements SkillsUtil {

	@Override
	public void showSkill(String skillName) {
		System.out.println("Developer.showSkill() : " + skillName);
	}

	// for method reference : if interface does not implements
	static void refreSkillabstract(String skillName) {
		System.out.println(skillName);
	}

	public static void main(String[] args) {

		// access abstract method - if implements an interface
		Developer devops = new Developer();
		devops.showSkill("Java 2");
		devops.showSkill("Java 3");
		devops.showSkill("Java 4");

		/* access abstract method - if does not implements an interface */
		// Pattern 1 : lambda Expression
		SkillsUtil absL = (val) -> System.out.println("Abstract Method : Lambda Expression -> " + val);
		absL.showSkill("Java 5");
		absL.showSkill("Java 6");
		absL.showSkill("Java 7");

		// Pattern 2 : Method Reference
		SkillsUtil absM = Developer::refreSkillabstract;
		absM.showSkill("Abstract Method : Method Reference -> Java 8");
		absM.showSkill("Abstract Method : Method Reference -> Java 9");
		absM.showSkill("Abstract Method : Method Reference -> Java 10");

		/* Access default method - required to implement an interface */
		Developer dev = new Developer();
		dev.profile();
		dev.skillName("JAVA");

		/*
		 * Access static method - does not matter whether an interface has been
		 * implemented or not
		 */
		SkillsUtil.skillOption();
		SkillsUtil.skillType("Java 8");
	}

}
