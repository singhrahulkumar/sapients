package com.ds.array;

public class ThirdSmallestElementFromArray {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 1, 32, 12, 3 };
		int n = find(arr);
		System.out.println(n);
	}

	private static int find(int[] arr) {

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i]<second) {
				third = second;
				second = arr[i];
			}else if(arr[i]<third) {
				third = arr[i];
			}
		}
		return third;

	}

}
