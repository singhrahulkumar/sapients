package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testmap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");

		Set<Entry<String, String>> list = map.entrySet();
		Iterator<Entry<String, String>> itr = list.iterator();

	}

}
