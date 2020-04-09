package com.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String s = "AbhishekPrasad";
		Set<Character> set = new HashSet<>();
		for(char c : s.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(Character c1 : set)
			sb.append(c1);
		System.out.println(sb.toString());
		

	}

}
