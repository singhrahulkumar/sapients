package com.String;

public class CompareString {

	public static void main(String[] args) {

		String string1 = new String("Geeksforgeeks");
		String string2 = new String("Practice");
		String string3 = new String("Geeks");
		String string4 = new String("Geeks");

		// Comparing for String 1 < String 2
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + stringCompare(string1, string2));

		// Comparing for String 3 = String 4
		System.out.println("Comparing " + string3 + " and " + string4 + " : " + stringCompare(string3, string4));

		// Comparing for String 1 > String 4
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + stringCompare(string1, string4));
		
		// using equals method
		
		System.out.println(string1.equals(string2));
		System.out.println(string3.equals(string4));
		System.out.println(string1.equals(string4));
		
	
	}

	private static int stringCompare(String string1, String string2) {

		int l1 = string1.length();
		int l2 = string2.length();
		int lm = Math.min(l1, l2);
		for (int i = 0; i < lm; i++) {
			int s1 = string1.charAt(i);
			int s2 = string2.charAt(i);
			if (s1 != s2) {
				return s1 - s2;
			}
		}
		if (l1 != l2) {
			return l1 - l2;
		} else {
			return 0;
		}

	}
}
