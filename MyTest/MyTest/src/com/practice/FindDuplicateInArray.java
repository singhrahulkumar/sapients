package com.practice;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int brr[] = new int[arr.length];
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = i+1; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					brr[m++] = arr[i];
					System.out.print(arr[i]+" ");
				}
			}
		}
		System.out.println();
		for (int i : brr) {
			System.out.print(i+" ");
		}

	}

}
