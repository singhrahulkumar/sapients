package com.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateNonNull {

	public static void main(String[] args) {
		predicate_check();
	}

	private static void predicate_check() {
		Predicate<String> nonNullCheck = Objects::nonNull;
		String s = "Abhishekkkk";
		boolean r = nonNullCheck.test(s);
		System.out.println(r);

		Predicate<String> hasLength10 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				if (t.length() > 10)
					return true;
				return false;
			}
		};

		boolean r1 = nonNullCheck.and(hasLength10).test(s);
		System.out.println(r1);
	}

}
