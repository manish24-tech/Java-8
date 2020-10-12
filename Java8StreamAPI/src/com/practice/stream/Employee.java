package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {

		List<Skill> skills = Arrays.asList(new Skill(1, "Java6", 3), new Skill(2, "Java7", 4), new Skill(3, "Java8", 5),
				new Skill(4, "Java9", 6),
				new Skill(5, "Spring2", 7), new Skill(6, "Spring3", 8), new Skill(1, "Spring4", 9)
				);
		
		// boolean allMatch(Predicate<? super T> predicate)
		boolean allMatch = skills.stream().allMatch(val -> val.getSkillName().startsWith("S"));
		
		//long count()
		long count = skills.stream().count();
		
		// void forEach(Consumer<? super T> action)
		skills.stream().forEach(System.out::println);
		
		//Stream<T> filter(Predicate<? super T> predicate)
		skills.stream().filter(val -> val.getSkillName().startsWith("J")).forEach(System.out::println);
		
		//<R> Stream<R> map(Function<? super T,? extends R> mapper)
		skills.stream().map(Skill::getRatting).filter(val -> val > 4).forEach(System.out::println);
		
		// Optional<T> reduce(BinaryOperator<T> accumulator)
		Integer reduce = skills.stream().map(Skill::getRatting).reduce(0, Integer::sum);
		
		// DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)
		double asDouble = skills.stream().mapToInt(a -> a.getRatting() ).average().getAsDouble();
		
		// Stream<T> sorted(Comparator<? super T> comparator)
		List<String> collect = skills.stream().map(Skill::getSkillName).sorted(String::compareTo).collect(Collectors.toList());
		
		
		
	}

}
