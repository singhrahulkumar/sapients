package com.java8.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetWithLamda {

	public static void main(String[] args) {

		Comparator<Integer> compare = (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;

		TreeSet<Integer> al = new TreeSet<>(compare);
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);

		System.out.println(al);

	}

}
