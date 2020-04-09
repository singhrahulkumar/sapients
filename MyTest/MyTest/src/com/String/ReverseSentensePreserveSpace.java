package com.String;

public class ReverseSentensePreserveSpace {

	public static void main(String[] args) {
		String s = "I Am Not String";
		reverseString(s);
	}

	private static void reverseString(String s) {

		char[] arr = s.toCharArray();
		char[] rarr = new char[s.length()];

		for (int i = 0; i < s.length() - 1; i++) {
			if (arr[i] == ' ') {
				rarr[i] = ' ';
			}
		}
		int j = s.length() - 1;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (arr[i] != ' ') {
				if (rarr[j] == ' ') {
					j--;
				}
				rarr[j--] = arr[i];
			}
		}

		System.out.println(String.valueOf(rarr));
	}

}
