package com.ds.array;

import java.util.Arrays;

public class CommonElementInTwoArray {

	public static void main(String[] args) {

		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };

		commonElement(arr1, arr2);

	}

	private static void commonElement(int[] l, int[] r) {

		Arrays.sort(l);
		Arrays.sort(r);
		int i = 0;
		int j = 0;
		while (i < l.length && j < r.length) {
			if (l[i] == r[j]) {
				System.out.println(l[i]);
				i++;
				j++;
			} else if (l[i] < r[j]) {
				i++;
			} else if (r[j] < l[i]) {
				j++;
			}
		}

	}

}
