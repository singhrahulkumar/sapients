package com.collection.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetComparator {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);

		TreeSet t2 = new TreeSet(new MyComparator2());
		t2.add(10);
		t2.add(0);
		t2.add(15);
		t2.add(5);
		t2.add(20);
		t2.add(20);
		System.out.println(t2);
		
		TreeSet t3 = new TreeSet(new MyComparator3());
		t3.add(10);
		t3.add(0);
		t3.add(15);
		t3.add(5);
		t3.add(20);
		t3.add(20);
		System.out.println(t3);
	}

}

/**
 * normal implementation
 * 
 * @author M1039239
 *
 */
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2) {
			return -1;
		} else
			return 0;
	}

}

class MyComparator2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		return -(i1.compareTo(i2));
	}

}

class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		return -1;
	}

}
