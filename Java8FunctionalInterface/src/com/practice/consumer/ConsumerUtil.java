package com.practice.consumer;

import java.util.List;
import java.util.function.Consumer;

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
public interface ConsumerUtil {
	
	/* 1. single abstract method - @FunctionalInterface interface rule */
	void display(String a, String b, String c);

	/* 3. Multiple static Method - @FunctionalInterface interface rule */
	static Consumer<List<Integer>> add() {
		Consumer<List<Integer>> consumer = System.out::println;
		return consumer;
	}



}
