package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("aaa");
		al.add("bbbb");
		al.add("ccccc");
		al.add("dddddd");

		/*
		 * List<String> l = al.stream().filter(s -> s.length() >=
		 * 4).collect(Collectors.toList()); System.out.println(l);
		 * 
		 * long l2 = al.stream().filter(s -> s.length() >= 4).count();
		 * System.out.println(l2);
		 * 
		 * List<String> l1 = al.stream().map(s ->
		 * s.toUpperCase()).collect(Collectors.toList()); System.out.println(l1);
		 */

		List<String> l = al.stream().filter(s -> s.length() >= 4).collect(Collectors.toList());
		System.out.println(l);

		List<String> l1 = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);

	}

}
