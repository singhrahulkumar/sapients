package com.java8.lambda;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithLamda {

	public static void main(String[] args) {

		Comparator<Integer> compare = (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;

		TreeMap<Integer, String> map = new TreeMap<>(compare);
		map.put(10, "aaa");
		map.put(0, "bbb");
		map.put(15, "ccc");
		map.put(5, "ddd");
		map.put(20, "eee");

		System.out.println(map);
	}

}
