package com.map.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPract {

	public static void main(String[] args) {

		Map<String, Integer> h = new HashMap<>();
		h.put("A", 101);
		h.put("B", 102);
		h.put("C", 103);
		h.put("D", 104);
		int m = h.put("B", 105);
		System.out.println(m);

		System.out.println(h.get("B"));

		Set<Entry<String, Integer>> s = h.entrySet();
		System.out.println(s);

		Iterator<Entry<String, Integer>> itr = s.iterator();
		while (itr.hasNext()) {

			Entry<String, Integer> e = itr.next();
			String name = e.getKey();
			Integer roll = e.getValue();
			System.out.println(name + "---" + roll);
			if (name.equals("C")) {
				e.setValue(110);
			}
		}
		System.out.println(s);
		System.out.println(h);

	}

}
