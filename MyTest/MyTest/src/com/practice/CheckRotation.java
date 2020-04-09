package com.practice;

public class CheckRotation {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		String s = s1.substring(s1.length() / 2) + s1.substring(0, s1.length() / 2);
		System.out.println(s);
		if (s.equalsIgnoreCase(s2)) {
			System.out.println("rotated");
		} else {
			System.out.println("not rotated");
		}
	}
}
