package com;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeating {

	public static void main(String[] args) {

		String s = "Abhibshek";
		Set<Character> set = new HashSet<>();
		Character c1 = null;
		for (Character c : s.toCharArray()) {
			if (!set.add(c)) {
				c1 = c;
				break;
			}
		}
		System.out.println(c1);

	}

}
