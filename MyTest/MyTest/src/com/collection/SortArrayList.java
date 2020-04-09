package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Geeks");
		list.add("For");
		list.add("ForGeeks");
		list.add("GeeksForGeeks");
		list.add("A computer portal");

		System.out.println("Unsorted ArrayList: " + list);
		
		//natural sorting order
		Collections.sort(list);
		System.out.println(list);
		
		//reverse sorting order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);

	}

}
