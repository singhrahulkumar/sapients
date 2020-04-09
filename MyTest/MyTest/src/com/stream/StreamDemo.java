package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(8);
		System.out.println(al);

		Predicate<Integer> p = i -> i % 2 == 0;
		List<Integer> s = al.stream().filter(i -> i % 2 == 0).map(i -> i * 2).collect(Collectors.toList());
		System.out.println(s);

		List<Integer> s1 = al.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(s1);

		System.out.println("Sorting according to some order");
		List<Integer> s2 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(s2);

		System.out.println("Sorting according to des some order");
		List<Integer> s3 = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(s3);

		Integer i3 = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(i3);

		al.stream().forEach(i -> System.out.print(i + " "));
		al.stream().forEach(System.out::print);

		System.out.println("Copying to array");
		Integer[] a = al.stream().toArray(Integer[]::new);

		for (int i : a)
			System.out.print(i + " ");


	}

}
