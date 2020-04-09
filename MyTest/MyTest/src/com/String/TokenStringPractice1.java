package com.String;

import java.util.StringTokenizer;

public class TokenStringPractice1 {

	public static void main(String[] args) {

		StringTokenizer st1 = new StringTokenizer("My Name is Abhishek");
		System.out.println(st1.countTokens());
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextElement()+" "+ st1.getClass().getName());
		}
		System.out.println("After  "+st1.countTokens());

		StringTokenizer st2 = new StringTokenizer("My Name is : Abhishek", ":");
		System.out.println(st2.countTokens());
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}

		StringTokenizer st3 = new StringTokenizer("My : Name : is : Abhishek", " :", true);
		System.out.println(st3.countTokens());
		while (st3.hasMoreElements()) {
			System.out.println(st3.nextElement());
		}

	
		
		

	}

}
