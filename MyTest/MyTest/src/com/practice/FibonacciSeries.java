package com.practice;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 9, sum = 0;
		int a = 0, b = 1;

		System.out.print(a);
		for (int i = 1; i <= 9; i++) {
			sum = a + b;
			b = a;
			a = sum;
			System.out.print(" " + sum);

		}

	}

}
