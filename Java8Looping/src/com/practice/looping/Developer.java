package com.practice.looping;

import java.util.Arrays;
import java.util.List;

/*
 *  forEach() is the default method of java.lang.Iterable interface that responsible iterate the elements of an arrays, collections
 *  forEachRemaining() is the default method of java.util.Spliterator interface that responsible to iterate elements of json object over keys as an action
 * @author manish.luste
 *
 */
public class Developer {
	public static void main(String[] args) {

		List<String> skills = Arrays.asList("Java", "Spring", "Hibernate", "Struts");
		
		// pattern 1 - print elements 
		skills.forEach(System.out::println);

	}
}
