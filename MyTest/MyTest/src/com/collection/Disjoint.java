package com.collection;

import java.util.*;

public class Disjoint {
	public static void main(String[] args) {

		List<String> mylist1 = new ArrayList<String>();
		mylist1.add("practice");
		mylist1.add("code");
		mylist1.add("quiz");
		mylist1.add("geeksforgeeks");

		// Let us create vector of strings
		List<String> mylist2 = new Vector<String>();
		mylist2.add("geeks");
		mylist2.add("code");
		mylist2.add("for");
		mylist2.add("coder");

		System.out.println(Collections.disjoint(mylist1, mylist2));

		// using array

		// Let us create arrays of integers
		Integer arr1[] = { 10, 20, 30, 40, 50 };
		Integer arr2[] = { 60, 70, 80, 90, 100 };
		Integer arr3[] = { 50, 70, 80, 90, 100 };
		Double arr4[] = { 50.0, 60.0, 110.0 };

		System.out.println(Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2)));

	
		
	StringBuilder sb = new StringBuilder("Abhi");
	StringBuilder sb1 = new StringBuilder("Abhi");
	StringBuilder sb2 = sb;
	System.out.println(sb.equals(sb1));
	System.out.println(sb.equals(sb2));
	
	sb.reverse();
	System.out.println();
	}

}
