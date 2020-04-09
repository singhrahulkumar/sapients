package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		mylist.add("practice");
		mylist.add("code");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		int i = Collections.frequency(mylist,"code");
		System.out.println(i);
		
		// how to get frequency of array element
		
		Integer[] arr = {1,2,3,4,4,4,5,5,6};
		i = Collections.frequency(Arrays.asList(arr), 4);
		System.out.println(i);
	}

}
