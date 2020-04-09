package com.arrays;

public class SeparateZeros {

	public static void main(String[] args) {
		int[] arr = { 14, 0, 5, 2, 0, 3, 0 };
		int[] darr =  seprate(arr);
		for (int i : darr) {
			System.out.print(i+" ");
		}
	}

	private static int[] seprate(int[] arr) {
		int[] darr = new int[arr.length];
		int j = 0;
		int k = arr.length-1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0) 
				darr[j++] = arr[i];
			else
				darr[k--] = arr[i];
		}
		return darr;
	}

}
