package com.ds.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 2);
	}

	private static void rotate(int[] arr, int n) {

		int[] brr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int index = (i + n) % arr.length;
			brr[index] = arr[i];
		}

		Arrays.stream(brr).forEach(System.out::print);
	}

}
