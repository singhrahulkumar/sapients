package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 45, 84, 101, 62, 12, 45 };
		selectionSort(arr);

	}

	private static void selectionSort(int[] arr) {

		int n = arr.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	

	}

}
