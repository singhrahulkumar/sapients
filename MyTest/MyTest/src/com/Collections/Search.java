package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Search {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(4);
		l.add(1);
		l.add(6);
		l.add(3);
		l.add(7);
		l.add(2);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 6));
		System.out.println(Collections.binarySearch(l, 5));
		Collections.sort(l,new MyComparator1());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 6,new MyComparator1()));
		System.out.println(Collections.binarySearch(l, 5,new MyComparator1()));
		
	}

}
class MyComparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2);
	}
}
