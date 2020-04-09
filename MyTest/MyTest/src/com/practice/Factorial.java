package com.practice;

public class Factorial {
	int k = 1;

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int n = 5;
		/*
		 * int n1 = f.factorial(n); System.out.println(n1);
		 */
		int n2 = f.factorialRecursive(n);
		System.out.println(n2);

	}

	// normal flow

	private int factorial(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;
	}

	private int factorialRecursive(int n) {
		if (n == 0)
			return 1;
		if (n > 0) {
			k = k * n;
			n = n - 1;
			return factorialRecursive(n);
		}
		return k;
	}

}
