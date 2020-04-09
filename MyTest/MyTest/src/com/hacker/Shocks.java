package com.hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Shocks {

	public static void main(String[] args) {

		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		int n = numbersOfPairs(ar);
		System.out.println(n);
	}

	private static int numbersOfPairs(int[] ar) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : ar) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map.toString());
		Set<Entry<Integer, Integer>> set = map.entrySet();
		int total = 0;
		for (Entry<Integer, Integer> s : set) {
				total = total + (s.getValue()/2);
		}
		return total;
	}

}
