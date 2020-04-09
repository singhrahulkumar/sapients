package com.ds.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "AbhishekA";

		Set<Character> set = new HashSet<>();
		List<Character> list = new ArrayList<>();
		for (Character c : s.toCharArray()) {
			if(!set.add(c))
				list.add(c);
		}
		System.out.println(list);
	}
}
