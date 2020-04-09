package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveEvenFrequencyCharacter {

	public static void main(String[] args) {

		String str = "zzzxxweeerr";

		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		StringBuffer sb = new StringBuffer();
		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> e = itr.next();
			if (e.getValue() % 2 == 0) {
				itr.remove();
			}
		}

		for (int i = 0; i < str.length() - 1; i++) {
			if(map.containsKey(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb.toString());

	}

}
