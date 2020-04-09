package com.hacker;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStringsCommon {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "world";
		String c = check(s1.toLowerCase(), s2.toLowerCase());
		System.out.println(c);
	}

	private static String check(String s1, String s2) {

		boolean flag = false;
		Set<Character> list = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		for (Character c : s2.toCharArray()) {
			if (list.contains(c)) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}

		if (flag) {
			return "NO";
		} else
			return "YES";

	}

}
