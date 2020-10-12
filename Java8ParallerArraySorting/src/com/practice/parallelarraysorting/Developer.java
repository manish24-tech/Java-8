package com.practice.parallelarraysorting;

import java.util.Arrays;

/**
 * Parallel Array Sorting : responsible to sort all primitive(long, char, int, float, double, short, boolean) type data array
 * @author manish.luste
 *
 */
public class Developer {

	public static void main(String[] args) {

		/*Approach 1:  sort primitive type data array */
		int[] arr = { 40, 10, 22, 5, 8, 9, -3, -2, 0 };
		
		// Pattern 1
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		//printSortedArray(arr);
		
		//Pattern 2
		Arrays.parallelSort(arr, 2, 6);
		printSortedArray(arr);	

	}

	/**
	 * Responsible to print sorted array comma separated
	 * @param arr
	 */
	private static void printSortedArray(int[] arr) {
		int i = 0;
		do {
			if(i == (arr.length-1)) {
				System.out.print(arr[i]);
				System.out.println("==============================");
			} else {
				System.out.print(arr[i]+", ");
			}
			i++;
		} while (i < arr.length);
	}
}
