package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class FindDuplicateInArray2 {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8,7 };

		HashMap<Integer, Integer> m = new HashMap<>();

		for (int i : arr) {
			if (m.containsKey(i))
				m.put(i, m.get(1) + 1);
			else
				m.put(i, 1);
		}

		Iterator<Entry<Integer, Integer>> itr = m.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, Integer> i = itr.next();
			if (i.getValue() > 1)
				System.out.print(i.getKey() + " ");
		}

	}

}
