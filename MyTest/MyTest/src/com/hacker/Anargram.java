package com.hacker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



import java.util.Set;

public class Anargram {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "hellon";

		char[] aarr = a.toCharArray();
		char[] barr = b.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (Character a1 : aarr) {
			if (map.containsKey(a1)) {
				map.put(a1, map.get(a1) + 1);
			} else {
				int count = 1;
				map.put(a1, count);
			}
		}
		System.out.println(map);

		Map<Character, Integer> mapb = new HashMap<>();

		for (Character b1 : barr) {
			if (mapb.containsKey(b1)) {
				mapb.put(b1, mapb.get(b1) + 1);
			} else {
				int count = 1;
				mapb.put(b1, count);
			}
		}
		System.out.println(mapb);

		boolean flag = true;
		Set<Entry<Character, Integer>> s = map.entrySet();
		Iterator<Entry<Character, Integer>> it = s.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> type = (Entry<Character, Integer>) it.next();
			Character c = type.getKey();

			Set<Entry<Character, Integer>> s1 = mapb.entrySet();
			Iterator<Entry<Character, Integer>> it1 = s1.iterator();

			if (mapb.containsKey(Character.toLowerCase(c)) | mapb.containsKey(Character.toUpperCase(c)) ) {
				while (it1.hasNext()) {
					Entry<Character, Integer> type1 = (Entry<Character, Integer>) it1.next();
					Character c1 = type1.getKey();

					if (c1.equals(c)) {
						if (type1.getValue() == type.getValue()) {
							break;
						} else {
							flag = false;
							break;
						}
					}
				}
			}
			else {
				flag = false;
				break;
			}
				

		}

		if (flag) {
			System.out.println("Anargram");
		} else
			System.out.println("Not Anargram");
	}

}
