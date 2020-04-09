package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {

		String s = "Abbbhhishek";
		Map<Character, Integer> map = new HashMap<>();
		for (char k : s.toCharArray()) {
			if (map.containsKey(k))
				map.put(k, map.get(k) + 1);
			else
				map.put(k, 1);
		}
		Map.Entry<Character, Integer> entry = map.entrySet().iterator().next();
		Character key = entry.getKey();
		Integer value = entry.getValue();
		Integer max = value;
		System.out.println(map);
		Character mc = null;
		Integer mv = null;
		for (Map.Entry e : map.entrySet()) {
			int cv = (int) e.getValue();
			char ck = (char) e.getKey();
			if (cv > max) {
				max = cv;
				mc = ck;
				mv = cv;
			}
		}

		System.out.println(mc + ".." + mv);
	}

}
