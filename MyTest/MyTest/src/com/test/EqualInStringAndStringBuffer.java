package com.test;

public class EqualInStringAndStringBuffer {
	public static void main(String[] args) {
		String s = "abhishek";
		String s1 = "abhishek";
		
		System.out.println(s.equals(s1));
		
		StringBuffer sb = new StringBuffer("A");
		StringBuffer sb1 = new StringBuffer("A");
		System.out.println(sb.equals(sb1));//
		System.out.println(sb == sb1);
		

	}
}
