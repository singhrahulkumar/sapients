package com.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class ListToArray {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		// Adding elements to the linked list
		linkedList.add("G");
		linkedList.add("e");
		linkedList.add("e");
		linkedList.add("k");
		linkedList.add("s");

		Object[] arr = linkedList.toArray();
		
		String[] sarr = Arrays.copyOf(arr, arr.length,String[].class);
		System.out.println(Arrays.toString(sarr));
	}

}
