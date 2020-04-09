package com.test;

public class Between {

	public static void main(String args[]) {

		Between b = new Between();
		int[] arr = { 4, 2, 7, 5 };
		b.find(arr);

	}

	private void find(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int num1 = arr[i];
			int num2 = arr[i + 1];

			int big = num1 > num2 ? num1 : num2;
			int small = num1 < num2 ? num1 : num2;
			System.out.println("number between " + small + "and" + big);
			for (int j = small; j <= big; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

}
