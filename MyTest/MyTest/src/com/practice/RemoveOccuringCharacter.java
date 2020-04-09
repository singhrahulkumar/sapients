package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveOccuringCharacter {

	public static void main(String[] args) {

		String s1 = "GeeksForGeeks";
		String s2 = "mask";

		Set<Character> mask = new HashSet<>();
		for (char character : s2.toCharArray()) {
			mask.add(character);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length() - 1; i++) {
			if (!mask.contains(s1.charAt(i))) {
				sb.append(s1.charAt(i));
			}
		}
		System.out.println(sb.toString());

	}

}
