package com.practice;

import java.util.Arrays;

public class FindLargestAndSmallest {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 30, 1, 5, 88, 4, 3 };
		/*
		 * Arrays.sort(arr); System.out.println(arr[0]+" "+ arr[arr.length]);
		 */

		find(arr);
	}

	private static void find(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println(max + " "+min);
	}

}
