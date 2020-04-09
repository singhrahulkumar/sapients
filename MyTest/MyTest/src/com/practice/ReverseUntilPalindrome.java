package com.practice;

public class ReverseUntilPalindrome {

	public static void main(String[] args) {

		int num = makePalindrome(7325);
		System.out.println(num);
	}

	public static int makePalindrome(int n) {

		int num = checkPalindrome(n);
		while (n != num) {
			int k = n + num;
			int m = makePalindrome(k);
			return m;
		}
		return num;

	}

	private static int checkPalindrome(int i) {
		String n = "";
		while (i > 0) {
			int rem = i % 10;
			n = n + rem;
			i = i / 10;
		}
		int reversed = Integer.valueOf(n);
		return reversed;
	}

}
