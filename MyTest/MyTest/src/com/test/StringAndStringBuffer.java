package com.test;


public class StringAndStringBuffer {

	// mutablity and immutability
	public static void main(String[] args) {

		String s = new String("abhishek");
		System.out.println(s.hashCode());
		System.out.println(s);
		
		s.concat("prasad");
		
		System.out.println(s.hashCode());
		System.out.println(s);
		
		
		StringBuffer sb = new StringBuffer("abhishek");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.append("prasad");
		System.out.println(sb.hashCode());
		System.out.println(sb);

	}

}
