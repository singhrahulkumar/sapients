package com.collection;

import java.util.ArrayList;
import java.util.List;

public class PartitionOfList {

	public static void main(String[] args) {

		// create an ArrayList
		List<String> list = new ArrayList<String>();

		list.add("Geeks");
		list.add("Practice");
		list.add("Contribute");
		list.add("IDE");
		list.add("Courses");
		// call split method which return List of array
		// List[] lists = split(list);
		List<String> list0 = list.subList(0, list.size() / 2);
		List<String> list1 = list.subList(list.size() / 2, list.size());

		System.out.println(list0);
		System.out.println(list1);

	}

	private static List[] split(List<String> list) {

		for (int i = 0; i < list.size() / 2; i++) {

		}
		return null;
	}

}
