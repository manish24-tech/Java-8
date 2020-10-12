package com.practice.staticmethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.practice.functionalinterface.OrganizationUtil;

/**
 * Method Reference To static Method : responsible to get reference of functional interface by referencing custom static method and predefine java api method
 * 
 * 
 * @author manish.luste
 *
 */
public class Employee {

	private static final Logger LOGGER = Logger.getLogger(Employee.class.getName());
	static List<String> employees = Arrays.asList("Manish", "Nehal", "Dipak", "Kamal", "Nisha");
	static List<Integer> age = Arrays.asList(15, 10, 30, 21, 22);
	
	static void subtract(int a, int b) {
		System.out.println("Employee.subtract() => "+ Math.subtractExact(a, b));
	}

	static void multiply(int a, int b) {
		LOGGER.info("Employee.multiply() => " + Math.multiplyExact(a, b));
	}

	public static void main(String[] args) {

		/* Approach 1 - Access default method of functional interface with referencing multiple static method of a class */ 
		OrganizationUtil s1 = Employee::subtract;
		s1.display(5, 2);

		OrganizationUtil s2 = Employee::multiply;
		s2.display(5, 3);

		/* Approach 2 - Access Predefined functional interface reference as java API method like string, Math, Date..etc */
		
		// Aggregate Function - with variation
		LOGGER.info("SUM => " + age.stream().reduce(0, Integer::sum));
		LOGGER.info("AVG => " + age.stream().mapToDouble(a -> a).average().getAsDouble());
		LOGGER.info("COUNT => " + age.stream().count());
		LOGGER.info("MIN => " + age.stream().reduce(Math::min).orElse(0));
		LOGGER.info("MIN With Compare => " + age.stream().min(Integer::compareTo).get());
		LOGGER.info("MAX => " + age.stream().reduce(0, Math::max));
		LOGGER.info("MAX With Compare=> " + age.stream().max(Integer::compareTo).orElse(0));

		
		/* Approach 3 - Print the collections result */
		
		// sorting : ascending and descending
		List<Integer> ascendingList = age.stream().sorted(Integer::compareTo).collect(Collectors.toList());
		ascendingList.forEach(System.out::println);

		Iterator<Integer> descendingList = age.stream().collect(Collectors.toCollection(LinkedList::new))
				.descendingIterator();
		descendingList.forEachRemaining(System.out::println);

	}
}
