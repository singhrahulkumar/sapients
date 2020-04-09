package com.ds.array;

public class FindMaximaElementInArray {

	public static void main(String[] args) {
		// int[] arr = { 2, 6, 2, 2, 6, 2, 2, 8, 2, 1 };

		int[] arr = { 2, 6, 2, 5, 6, 7, 2, 8, 2, 1 };

		Integer i = findMaxima(arr);
		System.out.println(i);
	}

	private static Integer findMaxima(int[] arr) {

		Integer count = null;
		Integer candidate = null;
		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				candidate = arr[i];
				count = 1;
			} else {
				if (arr[i] == candidate)
					count++;
				else
					count--;
			}
		}

		if (count == null)
			return null;

		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (candidate == arr[i])
				count++;
		}
		return (count > (arr.length / 2)) ? candidate : null;

	}

}
