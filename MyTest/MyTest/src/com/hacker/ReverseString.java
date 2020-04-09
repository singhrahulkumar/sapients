package com.hacker;

public class ReverseString {

	public static void main(String[] args) {

		String m = "madam";
		StringBuffer sb = new StringBuffer(m);
		sb.reverse();
		
		String n = sb.toString();
		System.out.println(n);
		if(m.equalsIgnoreCase(n)) {
			System.out.println("yes");
		}

	}

}
