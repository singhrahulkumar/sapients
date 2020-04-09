package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "Saket");
		map.put(25, "Saurav");
		map.put(12, "HashMap");

		Set<Entry<Integer, String>> entry = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entry.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();
			Integer i = e.getKey();
			String s = e.getValue();
			System.out.print(i + " ");
			System.out.println(s);
		}

	}

}
