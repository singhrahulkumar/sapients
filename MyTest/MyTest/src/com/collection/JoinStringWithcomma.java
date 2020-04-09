package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JoinStringWithcomma {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
		StringJoiner sj = new StringJoiner(",");
		for (String s : list) {
			sj.add(s);
		}
		System.out.println(sj.toString());

		String st = String.join(",", list);
		System.out.println(st);
	}

}
