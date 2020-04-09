package com.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {

		// primitive
		Integer[] a = { 10, 5, 20, 11, 6 };
		Arrays.deepToString(a);
		System.out.println("Before sorting");
		for (int i : a) {
			System.out.print(i + " ");
		}
		Arrays.sort(a);
		System.out.println();
		System.out.println("After sorting");
		for (int i : a) {
			System.out.print(i + " ");
		}

		String[] s = { "Aa", "Dd", "Cc", "Bb" };
		System.out.println();
		System.out.println("Before sorting");
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After sorting");
		Arrays.sort(s);
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After using comparatore");

		Comparator<String> c = (s1, s2) -> -s1.compareTo(s2);

		Arrays.sort(s, c);
		//Arrays.sort(s, new MyComparator());

		for (String i : s) {
			System.out.print(i + " ");
		}

	}

}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}
}
