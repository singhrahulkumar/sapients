package com.predicate;

import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {// Creating predicate

		Predicate<Integer> lesserThan = i -> (i < 18);
		System.out.println(lesserThan.test(19));

	}

}
