package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortMethod {

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
		
		Collections.sort(l,new MyComparator());
		System.out.println(l);
		
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2);
	}
	



}
