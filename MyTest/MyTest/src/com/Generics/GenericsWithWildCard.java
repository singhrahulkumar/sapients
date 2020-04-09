package com.Generics;

import java.util.ArrayList;

class WildcardDemo {

	public void m1(ArrayList<String> list) {
		list.add("C");
		list.add("D");
		System.out.println(list);
	}

	// but can take any type of arrayList
	// only for read operation
	public void m2(ArrayList<?> list) {
		System.out.println(list);
	}

	public void m3(ArrayList<? extends Number> list) {
		System.out.println(list);
	}

	public void m4(ArrayList<? super String> list) {
		System.out.println(list);
	}

}

public class GenericsWithWildCard {

	public static void main(String[] args) {

		WildcardDemo w = new WildcardDemo();

		// only string type arraylist can be passed
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		w.m1(list);

		// any type of arraylist can be passed to m2
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		w.m2(list1);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		w.m2(list2);

		// only child class of Number
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(4);
		w.m3(list3);

		// not applicable
		/*
		 * ArrayList<String> list4 = new ArrayList<>(); list4.add("A"); list4.add("B");
		 * w.m3(list4);
		 */

		ArrayList<Object> list5 = new ArrayList<>();
		list5.add(3);
		list5.add(4);
		w.m4(list5);
		
	}

}
