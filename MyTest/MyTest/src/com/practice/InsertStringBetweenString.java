package com.practice;

public class InsertStringBetweenString {

	public static void main(String[] args) {

		String s1 = "GeeksGeeks";
		String s2 = "for";
		int index = 4;
		String s = "";
		s = s1.substring(0, 4 + 1) + s2 + s1.substring(4 + 1);
		System.out.println(s);

	}

}
