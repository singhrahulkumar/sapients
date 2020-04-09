package com.hacker;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "a";
		long n = 1000000000000l;
		char c = 'a';
		checkNumberOfGivenCharacter(s, n, c);
	}

	private static void checkNumberOfGivenCharacter(String s, long n, char c) {

		long numberOfRepOfString = n / s.length();
		int val = 0;
		for (char c1 : s.toCharArray()) {
			if (c1 == c)
				val++;
		}
		System.out.println(val);

		long countOfChar = numberOfRepOfString * val;
		System.out.println(countOfChar);
		long remaining = n % s.length();
		if (remaining != 0) {
			for (int i = 0; i < remaining; i++) {
				if (s.charAt(i) == c)
					countOfChar++;
			}
		}
		System.out.println(countOfChar);
	}

}
