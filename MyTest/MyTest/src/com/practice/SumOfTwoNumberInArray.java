package com.practice;

public class SumOfTwoNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		prettyPrint(numbers, 7);
		System.out.println("-----------------------------");
		prettyPrint(numbersWithDuplicates, 7);

	}

	private static void prettyPrint(int[] arr, int i) {

		
		for (int m = 0; m < arr.length; m++) {
			int f = arr[m];
			for (int n = m + 1; n < arr.length; n++) {
				int s = arr[n];
				if ((f + s) == i) {
					System.out.printf("(%d, %d) %n", f, s);
				}
			}
		}
	}

}
