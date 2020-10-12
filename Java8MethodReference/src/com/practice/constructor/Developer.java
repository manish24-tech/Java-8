package com.practice.constructor;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Method Reference To Constructor : responsible to get reference of constructor
 * of class to set/get the values
 * 
 * @author manish.luste
 *
 */
public class Developer {

	public static void main(String[] args) {

		List<Skill> skills = Arrays.asList(new Skill(1, "Java"), 
										   new Skill(2, "Spring"),
										   new Skill(2, "Spring Boot"),
										   new Skill(3, "Liferay"),
										   new Skill(4, "Alfresco")
										  );

		// add values to the collection
		IntStream.range(0, 5).boxed().collect(Collectors.toCollection(LinkedList::new)).forEach(System.out::println);

		// add values of object into collection
		skills.stream().collect(Collectors.toCollection(LinkedList::new)).forEach(System.out::println);
		
		// add values of object into collection and sort the result in acceding order
		skills.stream().map(Skill::getSkillName).sorted(String::compareTo).collect(Collectors.toCollection(LinkedList::new)).forEach(System.out::println);
		
		// add specific field of object into collection and reverse the result
		skills.stream().map(Skill::getSkillName).collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator().forEachRemaining(System.out::println);
		
		// add specific field of object into collection with filter skill and reverse the result
		skills.stream().map(Skill::getSkillName).filter(s -> s.startsWith("S")).collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator().forEachRemaining(System.out::println);
		
		

	}

}
