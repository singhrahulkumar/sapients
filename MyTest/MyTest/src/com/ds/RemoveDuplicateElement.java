package com.ds;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2 };
		int brr[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				brr[j++] = arr[i];
			}
		}
		brr[j++] = arr[arr.length - 1];
		System.out.println(j);
		for (int i = 0; i < j; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
