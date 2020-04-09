package com.ds.array;

public class ArrayMerge {

	public static void main(String[] args) {

		int[] a = { 1, 7, 8, 11, 13 };
		int[] b = { 4, 5, 6 };
/*		
		int[] a = { 1, 5, 8};
		int[] b = { 4, 5, 6 };*/

		int[] c = new int[a.length + b.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (true) {
			if (a[i] <= b[j]) {
				c[k++] = a[i];
				i++;
			} else {
				c[k++] = b[j];
				j++;
			}
			if (j == b.length) {
				while (i < a.length) {
					c[k++] = a[i++];
				}
				break;
			}
			if (i == a.length) {
				while (j < a.length) {
					c[k++] = a[j++];
				}
				break;
			}
		}
		for (int k1 : c) {
			System.out.print(k1 +" ");
		}

	}

}
