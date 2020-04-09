package com.practice;

public class RemoveExtraDelimiterFromEnd {

	public static void main(String[] args) {
		
		String s = "Geeks, For, Geeks, ";
		String c = ", ";
		int i = s.lastIndexOf(c);
		System.out.println(s.substring(0,i));

	}

}