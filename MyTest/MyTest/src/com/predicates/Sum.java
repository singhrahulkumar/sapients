package com.predicates;

import java.util.function.Predicate;

public class Sum {

	public static void main(String[] args) {

		Predicate<Integer> p = a -> a > 10;
		Predicate<Integer> p1  = p.negate();
		
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		System.out.println(p1.test(5));

	}

}
