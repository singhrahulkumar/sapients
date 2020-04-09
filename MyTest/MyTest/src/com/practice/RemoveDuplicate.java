package com.practice;

public class RemoveDuplicate {

	static int removeDuplicates(int arr[], int n) {
		int brr[] = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				brr[j++] = arr[i];
			}
		}
		
		brr[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {
			arr[i] = brr[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 5 };
		int n = arr.length;

		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
