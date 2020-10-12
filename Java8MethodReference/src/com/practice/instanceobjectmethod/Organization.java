package com.practice.instanceobjectmethod;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Method Reference To Instance Method : responsible to get reference of object class instance(POJO) 
 * it is same as static method but here we are dealing with custom object that collaborate with default java api method
 * the deference is static is deal with plain static method while instance method is deal with object class method
 * 
 * 
 * @author manish.luste
 *
 */
public class Organization {
	private static final Logger LOGGER = Logger.getLogger(Organization.class.getName());
	
	public static void main(String[] args) {
		
		List<Resource> resources = new LinkedList<Resource>();
		resources.add(new Resource(1,"Manish", 80));
		resources.add(new Resource(2,"Nehal", 20));
		resources.add(new Resource(3,"Dipak", 50));
		resources.add(new Resource(4,"Kamal", 42));
		resources.add(new Resource(5,"Nisha", 10));
		
		
		// Aggregate function by mapping field
		LOGGER.info("SUM => " + resources.stream().map(Resource::getAge).reduce(0, Integer::sum));
		LOGGER.info("AVG => " + resources.stream().map(Resource::getAge).mapToDouble(a -> a).average().getAsDouble());
		LOGGER.info("COUNT => " + resources.stream().count());
		LOGGER.info("MIN => " + resources.stream().map(Resource::getAge).reduce(Math::min).orElse(0));
		LOGGER.info("MIN With Compare => " + resources.stream().map(Resource::getAge).min(Integer::compare).orElse(0));
		LOGGER.info("MAX => " + resources.stream().map(Resource::getAge).reduce(0, Math::max));
		LOGGER.info("MAX With Compare=> " + resources.stream().map(Resource::getAge).max(Integer::compare).orElse(0));
		
		// Sorting : ascending and descending order
		resources.stream().map(Resource::toString).sorted(String::compareTo).forEachOrdered(System.out::println);
		
		Iterator<Resource> descendingList = resources.stream().collect(Collectors.toCollection(LinkedList::new))
				.descendingIterator();
		descendingList.forEachRemaining(System.out::println);
		
		// filtering result by mapping field 
		Iterator<String> resourceNameList = resources.stream().map(Resource::getName).collect(Collectors.toCollection(LinkedList::new))
			.descendingIterator();
		resourceNameList.forEachRemaining(System.out::println);
		
		resources.stream().map(Resource::getName).filter(res -> res.startsWith("N")).collect(Collectors.toList()).forEach(System.out::println);
		
		 

	}

}
