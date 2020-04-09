package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Check {

	public static void main(String[] args) {
		String s = "Abhishek";
		char[] c = s.toCharArray();
		List<Character> l = new ArrayList<>();
		for (char character : c) {
			l.add(character);
		}
		Collections.reverse(l);
		System.out.println(l);

		
	}

}
