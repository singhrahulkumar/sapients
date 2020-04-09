package com.ds.array;

public class ZigZagArray {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 6, 2, 1, 8, 9 };
		zigzag(arr);
	}

	private static void zigzag(int[] a) {
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (flag) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			} else if (!flag) {
				if (a[i] < a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
			flag = !flag;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
