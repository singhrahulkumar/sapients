package com.collection.NavigableSet;

import java.util.TreeSet;

public class NavigableSetPract {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(9000);
		t.add(5000);
		t.add(6000);
		t.add(7000);
		t.add(8000);
		System.out.println(t);
		System.out.println(t.floor(2900));
		System.out.println(t.lower(3000));
		System.out.println(t.ceiling(6000));
		System.out.println(t.higher(6000));
		System.out.println(t.first());
		System.out.println(t.pollFirst());
		System.out.println(t.last());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);
	}

}
