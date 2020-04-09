package com.collection.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferSorting {

	public static void main(String[] args) {

		TreeSet<StringBuffer> sb = new TreeSet<>(new MyComparator5());
		sb.add(new StringBuffer("A"));
		sb.add(new StringBuffer("Z"));
		sb.add(new StringBuffer("K"));
		sb.add(new StringBuffer("L"));
		System.out.println(sb);
	}

}

class MyComparator5 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2); // descending order
		// or we can use this also
		// return s2.compareTo(s1);
	}

}
