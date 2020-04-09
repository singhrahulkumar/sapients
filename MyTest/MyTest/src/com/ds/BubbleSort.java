package com.ds;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 30, 10, 50, 20, 60, 40 };
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
