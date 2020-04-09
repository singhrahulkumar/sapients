package com.ds.array;

//find given number
//find smallest number
public class RotatedAndSortedArrayElement {

	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		System.out.println("Index of element 5 : " + findElementRotatedSortedArray(arr, 0, arr.length - 1, 5));
		System.out.println(
				"Index of smallest element : " + findSmallestElementRotatedSortedArray(arr, 0, arr.length - 1));

	}

	private static String findSmallestElementRotatedSortedArray(int[] a, int l, int h) {

		while (l < h) {
			int m = (l + h) / 2;
			if (a[m] > a[h]) {
				
			}
		}

		return null;
	}

	private static int findElementRotatedSortedArray(int[] a, int l, int h, int k) {

		while (l < h) {
			int m = (l + h) / 2;
			if (a[m] == k) {
				return m;
			}
			// if this condition is true it means right part is sorted
			if (a[m] <= a[h]) {
				if (k > a[m] && k <= a[h]) {
					l = m + 1;
				} else {
					h = m - 1;
				}
			} else {
				if (k > a[l] && k <= a[m]) {
					h = m - 1;
				} else {
					l = m + 1;
				}
			}
		}

		return -1;
	}

}
