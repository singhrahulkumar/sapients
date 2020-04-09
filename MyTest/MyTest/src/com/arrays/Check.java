package com.arrays;

import java.io.FileNotFoundException;

public class Check {

	public static void main(String[] args) {

		try {
		System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside catch");
		}
		
		finally {
			System.out.println("inside finally");
		}
		

		
	}

}
