package com.practice.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample implements ConsumerUtil {

	@Override
	public void display(String a, String b, String c) {
		System.out.println(a + b + c);

	}
	

	public static void main(String[] args) {
		ConsumerExample obj = new ConsumerExample();
		obj.display("Hi,", "Welcome", "Techies");

		// Pattern 1 - using lambda expression of java built-in interface
		Consumer<String> fil = val -> System.out.println("Consumer - Lambda Expression : "+val);
		fil.accept("Hi, Welcome Techies");

		// Pattern 2 - using method reference of java built-in interface
		Consumer<Object> fim = System.out::print;
		fim.accept("Consumer - Method Reference : "+ Math.PI);

		//Pattern 3 - using static method of custom functional interface
		Consumer<List<Integer>> fics = ConsumerUtil.add();
		fics.accept(Arrays.asList(2,4,5,7));		

	}

}
