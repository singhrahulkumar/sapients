package com.arrays;

import java.util.Arrays;
import java.util.List;

public class ConvertToList {

	public static void main(String[] args) {

		String[] s = { "Aa", "Dd", "Cc", "Bb" };
		List l = Arrays.asList(s);
		System.out.println(l.getClass().getName());
		System.out.println(l);
		//below line will give exception because 
		//this list is only reference not exactly List object
		// any thing which change the size will give exception
		
		//l.add("Ee");
		l.set(2, "Ee");
		System.out.println(l);
		
		//below line will give array store exception because this is array object
		// we cannot store hetrogenous object
		l.set(2, 1);
		
	}

}
