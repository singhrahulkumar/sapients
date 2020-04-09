package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

import com.String.StringJoinderVsBuilder;

public class SetOfStringToCommaSepratedString {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
		
		StringJoiner sj = new StringJoiner(",");
		for (String s : set) {
			sj.add(s);
		}
		System.out.println(sj.toString());

		String s = String.join(", ", set);
		System.out.println(s);
		
	}

}
