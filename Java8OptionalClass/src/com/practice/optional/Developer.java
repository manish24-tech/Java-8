package com.practice.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Optional class : it is the package of java.util to check the status of an
 * object and also used to manipulate the result data
 * 
 * @author manish.luste
 *
 */
public class Developer {

	private int rating;
	private String name;

	public Developer(int rating, String name) {
		this.rating = rating;
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		List<Developer> developers = Arrays.asList(new Developer(8, "Java"), new Developer(10, "Spring Boot"),
				new Developer(10, "Spring Boot"), new Developer(5, "Liferay"));

		// optional object to get the null-able to non-null
		try {
			Optional<Developer> ofNullable = Optional.ofNullable(developers.get(4));
			System.out.println("Record isavailable" + ofNullable);
		} catch (Exception e) {
			System.out.println("Record is not available");
		}

		// check the value is present or not
		boolean status = Optional.ofNullable(developers.get(2)).isPresent();
		String msg = (status == false) ? "Not present" : "Present";
		System.out.println("Developer.main() MSG => " + msg);

		// get sum of rating
		Integer totalRating = developers.stream().map(Developer::getRating).reduce(Integer::sum).get();
		System.out.println("Developer.main() Rating => " + totalRating);

		// print specific object field values(unique) from the list
		developers.stream().map(Developer::getName).collect(Collectors.toSet()).forEach(System.out::println);

		// print the filtered values from the list
		developers.stream().map(Developer::getName).filter(d -> d.startsWith("S")).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
