package com.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNull {

	public static void main(String[] args) {

		Predicate<String> removeNull = s -> s == null | s == "";

		String[] a = { "aaa", "", " ", "bbb", null };

		System.out.println("Before null removing");
		for (String s : a)
			System.out.print(s + ",");

		RemoveNull r = new RemoveNull();
		ArrayList<String> al = r.check(removeNull, a);
		System.out.println();
		System.out.println("After null removing");
		for (String s : al)
			System.out.print(s + ",");

	}

	private ArrayList<String> check(Predicate<String> removeNull, String[] a) {

		ArrayList<String> al = new ArrayList<>();
		int i = 0;
		for (String s : a) {
			if (!removeNull.test(s)) {
				al.add(s);
			}
		}
		return al;
	}
}
