package com.ds;

public class Squareroot {

	public static void main(String[] args) {
		int n = 2147395600;
		int i = check(n);
		System.out.println(i);
	}

	private static int check(int n) {
		long i;
		for (i = 1; i * i <= n; i++)
			;
		return (int)(i - 1);
	}

}
