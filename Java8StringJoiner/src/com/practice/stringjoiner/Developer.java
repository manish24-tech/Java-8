package com.practice.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * String Joiner : it is a class of java.util package that used to join the
 * string with character sequence, prefix and suffix
 * 
 * @author manish.luste
 *
 */
public class Developer {
	public static void main(String[] args) {
		StringJoiner buildStringPattern1 = new StringJoiner(",");
		StringJoiner buildStringPattern2 = new StringJoiner(",", "[" , "]");
		List<String> skills = Arrays.asList("Java", "Spring", "Hibernate", "Struts");
		
		// pattern 1
		skills.forEach(buildStringPattern1::add);
		System.out.println("Developer.main() with Delimiter => "+buildStringPattern1.toString());
		
		// pattern 2
		skills.forEach(buildStringPattern2::add);
		System.out.println("Developer.main() with Delimiter, Prifix and Suffix => "+buildStringPattern2.toString());
		
		// pattern 3
		buildStringPattern1.merge(buildStringPattern2);
		System.out.println("Developer.main() with merging 2 string joiner => "+buildStringPattern1.toString());
		
		
		Thread sd = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Developer.main(...).new Runnable() {...}.run()");
			}
		});
		sd.start();
		
		Thread sd1 = new Thread( () -> System.out.println("Developer.main()") );
		sd1.start();
		
	}
}

/**
 * Lambda Expression : skills.forEach(skill -> skills.add(skill));
 * Method Reference : skills.forEach(buildString::add);
 */
