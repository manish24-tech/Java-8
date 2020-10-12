package com.practice.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.model.Employee;
import com.practice.model.Skill;

/**
 * Method 1 : <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner)
 * it is less useful in real time project. rarely used when want to do  
 * @author manish.luste
 *
 */
public class Organization {

	public static void main(String[] args) {

		/**
		 * Rule : Create fresh result container in which multiple elements process parallelly to be merge  
		 * 1. supplier should be a class that contain methods to accept values into
		 * stream of elements and it have default instance(default constructor) 
		 * 
		 * 2.accumulator should have value(stream of elements) that accepted by supplier's method instance which will be fresh every time 
		 * 3. combiner should merge accumulator with combiner(new supplier) and store into supplier
		 */
		
		
		/* Approach 1 - get StringBuilder object with modified String elements(add delimiters to each element) */
		List<String> list = Arrays.asList("Manish", "Nehal", "Deepak", "Kamal", "Nisha");
		StringBuilder doc  = list.parallelStream()
				.collect(StringBuilder::new, (response, element) -> response.append("Dr.").append(element),
						(response1, response2) -> response1.append(", ").append(response2.toString()));
		System.out.println("Result: " + doc);

		/* Approach 2 - get primitive list with modified primitive elements(power of each element) */
		List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		ArrayList<Double> collect = list2.parallelStream().collect(ArrayList::new,
				(response, element) -> response.add(Math.pow(element, element)),
				(response1, response2) -> response1.addAll(response2));

		collect.stream().forEach(System.out::println);

		
		/* Approach 3 - get Object list with modifying object element(create new object from another object list) */
		List<Employee> employees = Arrays.asList(new Employee(1, "Joy", 29.5, "Java", true),
				new Employee(2, "Soy", 9.9, "Java", true), new Employee(3, "Poy", 19.2, "Java", true),
				new Employee(4, "Toy", 30.0, "Java", true));

		ArrayList<Object> collect2 = employees.stream().collect(ArrayList::new,
				(response, element) -> response.add(new Skill(1, element.getName(), element.getId())),
				(response1, response2) -> response1.addAll(response2));

		collect2.stream().collect(Collectors.toList()).forEach(System.out::println);

	}
}
