package com.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListOfStreamInArrayList {

	public static void main(String[] args) {
		// Get the lists to be flattened.
		List<Integer> a = Arrays.asList(1, 2);
		List<Integer> b = Arrays.asList(3, 4, 5, 6);
		List<Integer> c = Arrays.asList(7, 8, 9);

		List<List<Integer>> arr = new ArrayList<>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		System.out.println(arr);

		List<Integer> flatList = new ArrayList<>();
		flatList = flattenList(arr).collect(Collectors.toList());

		// Print the flattened list
		System.out.println(flatList);

		// using normal list
		List<Integer> flatList1 = new ArrayList<>();
		flatList1 = flattenList1(arr);
		System.out.println("--"+flatList1);

	}

	private static List<Integer> flattenList1(List<List<Integer>> arr) {
		List<Integer> finalList = new ArrayList<>();
		for (List<Integer> list : arr) {
			for (Integer e : list) {
				finalList.add(e);
			}

		}
		return finalList;
	}

	private static <T> Stream<T> flattenList(List<List<T>> arr) {
		List<T> finalList = new ArrayList<>();
		arr.forEach(l->l.forEach(e->finalList.add(e)));
		/*for (List<T> list : arr) {
			list.forEach(e -> finalList.add(e));
		}*/
		return finalList.stream();
	}

}
