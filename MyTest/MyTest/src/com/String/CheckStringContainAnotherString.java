package com.String;

import java.util.ArrayList;
import java.util.HashSet;

public class CheckStringContainAnotherString {

	public static void main(String[] args) {

		String s = "abhisek Prasad";
		s = s.replaceAll(" ", "");
		ArrayList<Character> list = new ArrayList<>();
		HashSet<Character> set = new HashSet<>();
		for (Character c : s.toCharArray()) {
			if (!set.add(c)) {
				System.out.println("First duplicate character is :" + c);
				break;
			}
		}
	}

}
