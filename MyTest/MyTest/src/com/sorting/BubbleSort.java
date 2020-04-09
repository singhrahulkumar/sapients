package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] num = { 45, 84, 101, 62, 12, 45 };
		selectionSort(num);

	}

	private static void selectionSort(int[] num) {

		while (true) {
			for (int i = 0; i <= num.length - 2; i++) {
				if (num[i] > num[i + 1]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}

	}

}
