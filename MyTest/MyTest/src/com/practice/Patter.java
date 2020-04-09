package com.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Patter {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 5 };

		Stream s = Stream.of(arr);
		List<Integer> brr = (List<Integer>) s.distinct().collect(Collectors.toList());
		System.out.println(brr);

	}

}
