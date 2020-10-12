package com.practice.pradicate;

import java.util.function.Predicate;

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
public interface PredicateUtil {

	/* 1. single abstract method - @FunctionalInterface interface rule */
	void display();

	/* 2. Multiple Default Method - @FunctionalInterface interface rule */
	default Predicate<Boolean> varifyObject() {
		Predicate<Boolean> d = val -> Boolean.valueOf(false);
		return d;
	}

	/* 3. Multiple static Method - @FunctionalInterface interface rule */
	static Predicate<Boolean> checkObject() {
		Predicate<Boolean> d = val -> Boolean.valueOf(false);
		return d;
	}

}
