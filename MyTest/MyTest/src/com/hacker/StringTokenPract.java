package com.hacker;

public class StringTokenPract {

	public static void main(String[] args) {

		String s = "YES      leading spaces        are valid,    problemsetters are         evillllll";
		String delims = "[ !,?._'@]+";
	//	String delims = "[ .,?!']+";
		String[] sarr = s.split(delims);
		System.out.println(sarr.length);
		for (String st : sarr) {
			System.out.println(st);
			System.out.println();
		}
	}
}
