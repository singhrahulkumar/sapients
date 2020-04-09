package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInArray3 {

	public static void main(String[] args) {

		int inputArray[] = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 7 };
		Set<Integer> uniqueElements = new HashSet<>();

		Set<Integer> duplicateElements = Arrays.stream(inputArray).filter(i -> !uniqueElements.add(i)).boxed()
				.collect(Collectors.toSet());

		System.out.println(duplicateElements);
		System.out.println(uniqueElements);
	}

}
