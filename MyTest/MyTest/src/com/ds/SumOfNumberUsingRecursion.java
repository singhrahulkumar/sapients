package com.ds;

public class SumOfNumberUsingRecursion {

	int sum = 0;

	public static void main(String[] args) {
		int i = 259;
		System.out.println(new SumOfNumberUsingRecursion().findSum(i));
	}

	private int findSum(int n) {
		if (n == 0) {
			return sum;
		} else {
			sum = sum + (n % 10);
			findSum(n/10);
			return sum;
		}

	}

}
