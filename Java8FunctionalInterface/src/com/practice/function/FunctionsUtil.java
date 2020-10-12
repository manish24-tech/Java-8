package com.practice.function;

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
public interface FunctionsUtil {
	
	/* 1. single abstract method - @FunctionalInterface interface rule */
	void display(String str);


	/* 2. Multiple Default Method - @FunctionalInterface interface rule */
	default Long findRouund(double value) {
		return Math.round(value);
	}
	
	default Double findPow(double x, double y) {
		return Math.pow(x, y);
	}

	/* 3. Multiple static Method - @FunctionalInterface interface rule */
	static Long showRouund(double value) {
		return Math.round(value);
	}
	
	static Double showPow(double x, double y) {
		return Math.pow(x, y);
	}


}
