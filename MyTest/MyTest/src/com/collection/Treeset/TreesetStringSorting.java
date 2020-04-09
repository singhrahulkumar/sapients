package com.collection.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetStringSorting {

	public static void main(String[] args) {

		TreeSet t = new TreeSet<>();
		t.add("Roja");
		t.add("S");
		t.add("Raja");
		t.add("G");
		t.add("R");
		t.add("Ramu");
		System.out.println(t);
		
		TreeSet t1 = new TreeSet<>(new MyComparator4());
		t1.add("Roja");
		t1.add("S");
		t1.add("Raja");
		t1.add("G");
		t1.add("R");
		t1.add("Ramu");
		System.out.println(t1);
		
	}

}

class MyComparator4 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = (String) o2;
		return -s1.compareTo(s2); // descending order
		// or we can use this also
		//return s2.compareTo(s1);
	}

}
