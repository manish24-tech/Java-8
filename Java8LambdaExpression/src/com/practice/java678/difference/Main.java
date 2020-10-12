package com.practice.java678.difference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparable<Main> {

	private int rating;
	private String name;

	public Main(int rating, String name) {
		this.rating = rating;
		this.name = name;
	}
	
	// java 6 approach
	@Override
	public int compareTo(Main o) {
		return o.name.startsWith("L") ? 0 : -1;
	}
	
	@Override
	public String toString() {
		return "Main [rating=" + rating + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		
		/* Approach 1 - custom object*/
		List<Main> list = Arrays.asList(new Main(3, "Manish"), new Main(2, "Luste"), new Main(5, "ManLus"));
		
		//Java 6 approach - compareTo() at model
		System.out.println("Main.main() => ");
		list.stream().forEach(System.out::println);
		
		
		// Java 7 Approach - anonymous interface implementation 
		System.out.println("Main.main() => ");
		Collections.sort(list, new Comparator<Main>() {

			@Override
			public int compare(Main o1, Main o2) {
				return (o1.rating > o2.rating) ? 0 : -1;
			}
		});
		list.stream().forEach(System.out::println);
		
		
		// Java 8 approach - lambda expression to pass value to the Comparator interface
		System.out.println("Main.main() => ");
		Collections.sort(list, (o1, o2) -> (o1.rating < o2.rating) ? 0 : -1);
		list.stream().forEach(System.out::println);
		
		
		/* Approach 2 - non-primitive object*/
		Integer[] list2 = {2, 4, 7, 1, 0 };
		
		
		// java 6 and 7 approach - Anonymous interface implementation 
		System.out.println("Main.main() => ");
		Arrays.sort(list2, new Comparator<Integer>() {
			//Descending order
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 < o2) ? 0 : -1;
			}
		
		});
		Arrays.stream(list2).forEach(System.out::println);
	
		// java 8 approach - Method reference to pass value to the comparable
		System.out.println("Main.main() => ");
		//Acceding order
		Arrays.sort(list2, Integer::compareTo);
		Arrays.stream(list2).forEach(System.out::println);
		 
		
	}

	
}
