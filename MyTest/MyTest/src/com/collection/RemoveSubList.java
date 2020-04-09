package com.collection;

import java.util.AbstractList;
import java.util.LinkedList;

public class RemoveSubList {

	public static void main(String[] args) {
		AbstractList<String> list = new LinkedList<String>();

		// Using add() method
		// to add elements in the list
		list.add("GFG");
		list.add("for");
		list.add("Geeks");
		list.add("computer");
		list.add("portal");

		list.subList(1, 3).clear();
		System.out.println(list);

	}

}
