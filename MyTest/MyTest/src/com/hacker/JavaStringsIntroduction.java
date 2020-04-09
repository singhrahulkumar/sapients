package com.hacker;

import java.util.Arrays;

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		String A = "hello";
		String B = "java";

		System.out.println(A.length() + B.length());
		if (A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");

		String aC = A.substring(0, 1).toUpperCase();
		String AC = aC + A.substring(1);

		String bC = B.substring(0, 1).toUpperCase();
		String BC = bC + B.substring(1);
		System.out.println(AC+BC);

	}

}
