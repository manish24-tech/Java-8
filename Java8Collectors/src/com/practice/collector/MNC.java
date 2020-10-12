package com.practice.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Method 2 : <R, A> R collect(Collector<? super T, A, R> collector)
 * 
 * @author manish.luste
 *
 */
public class MNC {

	public static void main(String[] args) {
	
		List<Integer> age = Arrays.asList(1, 2, 3, 4, 5);
		
		/* Collection Function */
		List<Integer> collect = age.stream().collect(Collectors.toList());
		collect.stream().forEach(System.out::print);
		System.out.println("--");
		
		ArrayList<Integer> collect3 = age.stream().collect(Collectors.toCollection(ArrayList::new));
		collect3.stream().forEach(System.out::println);
		
		Set<Integer> collect6 = age.stream().collect(Collectors.toSet());
		System.out.println("--> "+collect6);
		
		
		Function<Integer, Integer> keyMapper = (val) -> val.hashCode();
		Function<Integer, Integer> valueMapper = (val) -> (val % 2 != 0) ? val : 0;
		Map<Integer, Integer> collect5 = age.stream().collect(Collectors.toMap(keyMapper, valueMapper));
		System.out.println(collect5);
		
		
		/* Reduction Operation */
			
		//Pattern 1 : with binary operator
		Optional<Integer> reduce = age.stream().reduce((a,b) -> a+b/5 );
		System.out.println("M.R => AVG : " + reduce.get());

		Optional<Integer> red1 = age.stream().reduce( (x, y) -> Math.min(x, y));
		System.out.println("L.M => MIN : " + red1.get());
		
		Optional<Integer> red2 = age.stream().reduce(Math::max);
		System.out.println("M.R => MAX : " + red2.get());
		
		//Pattern 2 : Binary operator with identity(operation identity : result -> operation -> identity ) 
		Integer red3 = age.stream().reduce(2, (a, b) -> (a + b) );
		System.out.println("M.R => sum  : " + red3);
		
		Integer red4 = age.stream().reduce(0, Math::multiplyExact);
		System.out.println("M.R => MUL : " + red4);
		
		
		/* Summarize Operation */
		//Simple
		IntSummaryStatistics collect1 = age.stream().collect(Collectors.summarizingInt(val -> val) );
		
		//complex
		IntSummaryStatistics collect2 = age.stream().collect(Collectors.summarizingInt(val -> (val % 2 == 0) ? val : 0 ) );
		System.out.println("collect.getAverage(); : " + collect2.getAverage());
		System.out.println("collect.getCount(); : " + collect2.getCount());
		System.out.println("collect.getMax(); : " + collect2.getMax());
		System.out.println("collect.getMin(); : " + collect2.getMin());
		System.out.println("collect.getSum(); : " + collect2.getSum());
		
		
		/* Groping and Joining Operation */
		
		Function<Integer, Integer> evenAge = (val) -> val % 2;  
		Map<Integer, List<Integer>> collect4 = age.stream().collect(Collectors.groupingBy(evenAge));
		System.out.println(collect4.toString());
		System.out.println(collect4.get(0));
		
		List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
		String result1=  list.stream().collect(Collectors.joining("-"));
		String result2=  list.stream().collect(Collectors.joining(",","[","]"));
		System.out.println("Joining Result: "+ result1.concat(result2));
				

	}
}
