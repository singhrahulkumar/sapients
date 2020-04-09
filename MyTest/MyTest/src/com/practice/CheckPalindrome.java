package com.practice;

public class CheckPalindrome {

	public static void main(String[] args) {

		String a = "abhishek";
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		if (a.equals(sb.toString()))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	}

}
