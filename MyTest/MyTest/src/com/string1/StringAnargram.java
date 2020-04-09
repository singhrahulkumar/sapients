package com.string1;

import java.util.Arrays;

public class StringAnargram {

	public static void main(String[] args) {

		String s = "Hitler moman";
		String s1 = "Mother In Law";
		
		s = s.toLowerCase().replaceAll(" ", "");
		s1 = s1.toLowerCase().replaceAll(" ", "");
		System.out.println(s.length()+" "+s1.length());
		
		char[] sarr = s.toCharArray();
		char[] sarr1 = s1.toCharArray();
		Arrays.sort(sarr);
		Arrays.sort(sarr1);
		System.out.println();
		s = new String(sarr);
		s1 = new String(sarr1);
		boolean flag = false;
		if(s.length() != s1.length()) {
			System.out.println("Not anargram");
		}else {
			for(int i = 0;i <s.length()-1;i++) {
				if(sarr[i] != sarr1[i]) {
					flag  = true;
					break;
				}
					
			}
		}
		if(flag)
			System.out.println("Not anargram");
		else {
			System.out.println("Anargram");
		}
		
	}

}
