package com.predicate;

import java.util.function.Predicate;

public class PredicateOr {

	public static void main(String[] args) {

		String s = "Abhishekkkkkkk";

		predicateOr(s);

	}

	private static void predicateOr(String s) {

		Predicate<String> predicateContain = i -> i.contains("A");
		System.out.println(predicateContain.test(s));
		System.out.println(hasLength10.test(s));
		boolean r = predicateContain.and(hasLength10).test(s);
		System.out.println(r);
		
		
	}

	public static Predicate<String> hasLength10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			if (t.length() > 10)
				return true;
			return false;
		}
	};

}
