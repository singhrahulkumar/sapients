package com.ds.array;

import java.util.Arrays;

public class FirstDuplicateElement {

	public static void main(String[] args) {
		int a[] = { 10, 7, 8, 1, 8, 7, 6 };
		findFirstDuplicate(a);
	}

	private static void findFirstDuplicate(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[i + 1]) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
