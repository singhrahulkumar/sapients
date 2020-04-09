package com.ds.array;

public class FindFrequencyOfElement {

	public static void main(String[] args) {
		int[] a = { 2, 3, 3, 2, 5 };
		findFrequency(a);
	}

	private static void findFrequency(int[] a) {
		int n = a.length;
		int[] count = new int[n];

		for (int i = 0; i < n; i++) {
			count[a[i] - 1]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + " " + count[i]);
		}
	}

}
