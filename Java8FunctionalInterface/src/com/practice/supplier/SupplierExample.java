package com.practice.supplier;

import java.util.function.Supplier;

public class SupplierExample implements SupplierUtil {

	@Override
	public void display(String a, String b, String c) {
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		SupplierExample obj = new SupplierExample();
		obj.display("Hi,", "Welcome", "Techies");

		// Pattern 1 - using lambda expression of java built-in interface
		Supplier<Object> fil = () -> Math.sqrt(2.2);
		System.out.println("Supplier - Lambda Expression : " + fil.get());

		// Pattern 2 - using method reference of java built-in interface
		Supplier<Object> fim = Math::random;
		System.out.println("Supplier - Method Reference : " + fim.get());

		// Pattern 3 - using static method of custom functional interface
		Supplier<Object> fics = () -> SupplierUtil.add();
		System.out.println("Supplier - static method : " + fics.get());

		// Pattern 4 - using default method of custom functional interface
		Supplier<Object> ficd = obj::areaOfCircle;
		System.out.println("Supplier - default method : " + ficd.get());

	}

}
