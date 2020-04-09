package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithLamda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		al.add(25);

		Comparator<Integer> compare = (i1, i2) -> {
			return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;
		};

		Collections.sort(al, compare);
		System.out.println(al);
	}
}
