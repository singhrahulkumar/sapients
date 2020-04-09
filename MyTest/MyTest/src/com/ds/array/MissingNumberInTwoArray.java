package com.ds.array;

import java.util.Stack;

public class MissingNumberInTwoArray {

	public static void main(String[] args) {
		int[] a = { 9, 7, 8, 5, 4, 6, 2, 3, 1 };
		int[] b = { 2, 3, 4, 9, 1, 8, 5, 6 };
		findMissingElement(a, b);
	}

	private static void findMissingElement(int[] a, int[] b) {
		int result = a[0];
		for (int i = 1; i < a.length; i++)
			result = result ^ a[i];
		for (int i = 0; i < b.length; i++)
			result = result ^ b[i];
		System.out.println(result);
	}

}
