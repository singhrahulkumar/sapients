package com.ds.string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "abhisheka";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : s.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);

		}
		System.out.println(map);

		map.entrySet().stream().filter(e -> {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				return Boolean.TRUE;
			}
			return false;
		}).findFirst();

	}

}
