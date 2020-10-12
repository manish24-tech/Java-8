package com.practice.optionalclass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Developer {

	public static void main(String[] args) {

		List<Skill> developerSkill = Arrays.asList(new Skill(1, "JAVA8", 9), new Skill(2, "JAVA9", 10),
				new Skill(3, "Hibernate", 5));

		// Lambda Expression with looping
		developerSkill.stream().forEachOrdered(skill -> {
			if (skill.getRatting() > 5 && skill.getName().startsWith("J")) {
				System.out.println(skill);
			}
		});

		System.out.println("Developer.main()");
		// Lambda Expression with Optional Class (filter and map)
		List<Integer> collect = developerSkill.stream().map(skill -> skill.getRatting())
				.filter(val -> val.intValue() > 5).collect(Collectors.toList());
		
		developerSkill.stream().filter( val -> (val.getRatting() > 5 && val.getName().startsWith("J")) )
				.forEach(System.out::println);
	}

}
