package com.practice.functionalinterface;
/**
 * Functional Interface : Responsible to declare single abstract method and multiple default and static mehod 
 * To access default method object initialization is required
 * To access static method object initialization is not required. it directly accessible in any of class
 * of class to set/store the values
 * 
 * @author manish.luste
 *
 */
@FunctionalInterface
public interface OrganizationUtil {
	
	/* 1. single abstract method - @FunctionalInterface interface rule */
	void display(int x, int y);

	/* 2. Multiple Default Method - @FunctionalInterface interface rule */
	/* 3. Multiple static Method - @FunctionalInterface interface rule */
}
