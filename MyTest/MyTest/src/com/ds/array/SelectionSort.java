package com.ds.array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 30, 10, 50, 20, 60, 40 };
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int iMin = i;
			for (int j = i + 1; j < n ; j++) {
				if (arr[j] < arr[iMin]) {
					iMin = j;
				}
			}
			if (iMin != i) {
				int temp = arr[iMin];
				arr[iMin] = arr[i];
				arr[i] = temp;
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
