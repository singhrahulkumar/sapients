package com.practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int missing = new FindMissingNumber().getMissingNumber(arr, 5);
		System.out.println(missing);
	}

	private int getMissingNumber(int[] arr, int i) {
		int sum = 0;
		for (int k = 0; k <= i; k++) {
			sum = sum + k;
		}
		int tsum = 0;
		for (int m = 0; m < arr.length; m++) {
			tsum = tsum + arr[m];
		}

		return sum - tsum;
	}

}
