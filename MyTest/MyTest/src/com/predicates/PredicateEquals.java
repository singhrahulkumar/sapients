package com.predicates;

import java.util.function.Predicate;

public class PredicateEquals {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("Abhishek");
		
		System.out.println(p.test("Abhishek"));
	}

}
