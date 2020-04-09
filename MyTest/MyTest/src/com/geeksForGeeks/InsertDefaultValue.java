package com.geeksForGeeks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;

public class InsertDefaultValue {

	public static void main(String[] args) {

		// Get the map
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, null);
		map.put(4, 4);
		map.put(5, null);
		map.put(6, null);

		// Print the original map
		System.out.println("Map with null values: " + map);

		Set<Entry<Integer, Integer>> eSet = map.entrySet();
		Integer defaultValue = 0;
		
	

		Iterator itr = eSet.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Integer> i = (Entry<Integer, Integer>) itr.next();
			Integer value = i.getValue();
			if (value == null) {
				i.setValue(defaultValue);
			}
		}
		System.out.println(map);
	}

}
