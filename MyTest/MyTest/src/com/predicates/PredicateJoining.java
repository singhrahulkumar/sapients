package com.predicates;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		PredicateJoining t = new PredicateJoining();
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p = i -> i > 10;
		Predicate<Integer> p1 = i -> (i % 2) == 0;

		System.out.println("Greater than 10");
		t.m1(p, x);
		System.out.println("Even number");
		t.m1(p1, x);

		System.out.println("Greater than 10 and Even");
		t.m1(p1.and(p), x);

		System.out.println("Greater than 10 or Even");
		t.m1(p1.or(p), x);

		System.out.println("Negate of greater than 10");
		t.m1(p.negate(), x);

	}

	private void m1(Predicate<Integer> p, int[] x) {

		for (int x1 : x) {
			if (p.test(x1))
				System.out.print(x1 + " ");
		}

		System.out.println("-------");

	}

}
