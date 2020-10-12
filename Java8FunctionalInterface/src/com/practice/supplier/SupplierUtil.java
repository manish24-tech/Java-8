package com.practice.supplier;

/**
 * Functional Interface : Responsible to declare single abstract method and
 * multiple default and static mehod To access default method object
 * initialization is required To access static method object initialization is
 * not required. it directly accessible in any of class of class to set/store
 * the values
 * 
 * @author manish.luste
 *
 */
@FunctionalInterface
public interface SupplierUtil {
	
	/* 1. single abstract method - @FunctionalInterface interface rule */
	void display(String a, String b, String c);


	/* 2. Multiple Default Method - @FunctionalInterface interface rule */
	default double areaOfCircle() {
		return Math.PI * 2 * 2;
	}

	/* 3. Multiple static Method - @FunctionalInterface interface rule */
	static int add() {
		return 2 + 2;
	}



}
