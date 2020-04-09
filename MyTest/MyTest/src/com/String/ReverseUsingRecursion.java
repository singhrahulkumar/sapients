package com.String;

public class ReverseUsingRecursion {

	int j;

	public static void main(String[] args) {

		ReverseUsingRecursion r = new ReverseUsingRecursion();
		String s = "Abhishek";
		reverse(s);

		char b[] = new char[s.length()];
		r.reverse(s, s.length() - 1, b);

	}

	private static void reverse(String s) {
		if (s.length() <= 1 || s == null) {
			System.out.println(s);
		} else {
			System.out.print(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));
		}
	}

	private void reverse(String s, int length, char[] b) {

		if (length >= 0) {
			b[j++] = s.charAt(length--);
			reverse(s, length, b);
		} else
			System.out.println(new String(b));

	}

}
