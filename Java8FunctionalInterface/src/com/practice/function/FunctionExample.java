package com.practice.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample implements FunctionsUtil {

	@Override
	public void display(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		FunctionExample obj = new FunctionExample();
		FunctionsUtil d =  obj::display;
		d.display("FunctionsExample.main()");
		
		/*Function*/
		
		// Pattern 1 - using lambda expression of java built-in interface 
		Function<Double, Long> fil = val ->  Math.round(val);
		System.out.println("BiFunction - Lambda Expression : "+  fil.apply(12.5));
		
		// Pattern 2 - using method reference of java built-in interface
		Function<Double, Long> fim = Math::round;
		System.out.println("BiFunction - Method Reference : "+  fim.apply(12.5));
		
		// Pattern 3 - using static method of custom functional interface
		Function<Double, Long> fics = val ->  FunctionsUtil.showRouund(val);
		System.out.println("BiFunction - static method : "+  fics.apply(12.5));
		
		// Pattern 4 - using default method of custom functional interface
		Function<Double, Long> ficd = obj::findRouund;
		System.out.println("BiFunction - default method : "+  ficd.apply(12.5));
		
		
		/*BiFunction*/
		BiFunction<Double, Double, Double> bfil = (a,b) ->  Math.pow(a, b);
		System.out.println("BiFunction - Lambda Expression : "+  bfil.apply(2.0, 2.0));
		
		BiFunction<Integer, Integer, Integer> bfim = Math::max ;
		System.out.println("BiFunction - Method Reference : "+  bfim.apply(2, 5));
		
		BiFunction<Double, Double, Double> bfis = FunctionsUtil::showPow;
		System.out.println("BiFunction - static method : "+  bfis.apply(2.0, 2.0));
		
		BiFunction<Double, Double, Double> bfid = (x , y) -> obj.findPow(x, y);
		System.out.println("BiFunction - default method : "+  bfid.apply(2.0, 2.0));
		
		
	}

}
