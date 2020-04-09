package com.predicate;

import java.util.function.Predicate;

public class PredicateChaining {

	public static void main(String[] args) {

		Predicate<Integer> greaterThan = i -> (i > 10);

		Predicate<Integer> lesserThan = i -> (i < 20);

		Predicate<Integer> equal = i -> (i == 15);
		
		System.out.println(greaterThan.test(15));
		System.out.println(lesserThan.test(15));

		boolean r1 = greaterThan.and(lesserThan).and(equal).test(15);
		System.out.println(r1);
		
		boolean r2 = greaterThan.and(lesserThan).negate().test(15);
		System.out.println(r2);
		
		System.out.println(greaterThan.test(15));
		System.out.println(lesserThan.test(15));
		System.out.println(equal.test(15));
		
		

	}

}
