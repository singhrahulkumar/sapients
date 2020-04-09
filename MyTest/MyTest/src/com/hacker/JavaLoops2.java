package com.hacker;

public class JavaLoops2 {

	
	// program for printing series
	
	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		int n = 5;

		for (int i = 0; i < n; i++) {
			int s1 = 0;

			for (int j = 0; j <= i; j++) {
				s1 = s1 + (int) Math.pow(2, j) * b;
			}
			int sum = a + s1;
			System.out.print(sum + " ");
		}

	}

}
