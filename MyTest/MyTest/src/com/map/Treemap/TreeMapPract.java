package com.map.Treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapPract {

	public static void main(String[] args) {

		TreeMap m = new TreeMap<>();
		m.put(101, "A");
		m.put(108, "b");
		m.put(104, "c");
		m.put(103, "A");
		m.put(102, "A");
		System.out.println(m);

		TreeMap m1 = new TreeMap(new MyComparator());
		m1.put(101, "A");
		m1.put(108, "b");
		m1.put(104, "c");
		m1.put(103, "A");
		m1.put(102, "A");
		System.out.println(m1);

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2)
			return 1;
		if (i1 > i2)
			return -1;
		return 0;
	}

}
