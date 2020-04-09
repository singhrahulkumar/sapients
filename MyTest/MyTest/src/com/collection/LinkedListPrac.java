package com.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPrac {

	public static void main(String[] args) {
		LinkedList<String> object = new LinkedList<String>();

		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		System.out.println("Linked list : " + object);
		
		LinkedList <String> object1 =  (LinkedList<String>) object.clone();
		System.out.println(object1);
		Collections.reverse(object1);
		System.out.println(object1);
		
		
	}

}
