package com.predicate;

import java.util.function.Predicate;

public class PredicateInFunction {

	public static void main(String[] args) {

		pred(11, i -> (i < 10));

	}

	private static void pred(int i, Predicate<Integer> p) {
		
		System.out.println(p.test(i));
		
	}


}
