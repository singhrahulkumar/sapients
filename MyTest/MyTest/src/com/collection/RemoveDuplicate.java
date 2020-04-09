package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		// Print the Arraylist
		System.out.println("ArrayList with duplicates: " + list);

		// Remove duplicates
		List<Integer> newList = removeDuplicates(list);
		System.out.println("ArrayList with duplicates removed: " + newList);

		// Print the ArrayList with duplicates removed
		// using set
		Set<Integer> wD = new HashSet<>(list);
		System.out.println("ArrayList with duplicates removed: " + wD);

		// using stream

		List<Integer> s = list.stream().distinct().collect(Collectors.toList());
		System.out.println("ArrayList with duplicates removed: " + s);

	}

	private static <T> List<T> removeDuplicates(ArrayList<T> list) {

		List<T> newList = new ArrayList<T>();

		for (T t : list) {
			if (!newList.contains(t)) {
				newList.add(t);
			}
		}
		return newList;
	}

}
