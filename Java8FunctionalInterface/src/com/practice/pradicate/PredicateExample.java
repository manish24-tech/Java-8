package com.practice.pradicate;

import java.util.function.Predicate;

public class PredicateExample implements PredicateUtil {

	@Override
	public void display() {
		System.out.println("PredicateExample.display()");
	}
	
	public static void main(String[] args) {
		
		PredicateExample obj = new PredicateExample();
		PredicateUtil d =  () -> obj.display();
		d.display();
				
		// Pattern 1 - using lambda expression of java built-in interface
		Predicate<String> pils = val -> val.startsWith("T");
		System.out.println("Predicate - Lambda Expression : "+  pils.test("Test"));
		
		// Pattern 2 - using method expression of java built-in interface
		Predicate<Boolean> pim = Boolean::valueOf;
		System.out.println("Predicate - Method Reference : "+  pim.test(Boolean.FALSE));
		
		// Pattern 3 - using static method of custom functional interface
		Predicate<Boolean> pics = PredicateUtil.checkObject();
		System.out.println("Predicate - static method : "+  pics.test(Boolean.TRUE));
		
		// Pattern 4 - using static method of custom functional interface
		Predicate<Boolean> picd = obj.varifyObject();
		System.out.println("Predicate - default method : "+  picd.test(Boolean.FALSE));
		
		
		
		
	}

}
