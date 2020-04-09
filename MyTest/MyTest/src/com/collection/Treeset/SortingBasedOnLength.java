package com.collection.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingBasedOnLength {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyCustomComp());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}
}

class MyCustomComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		if (s1.length() < s2.length())
			return -1;
		else if (s1.length() > s2.length()) {
			return +1;
		}
		return s1.compareTo(s2);
	}

}

class MyCustomComp1 implements Comparable {

	@Override
	public int compareTo(Object o) {

		return 0;
	}

}
