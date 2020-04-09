package com.predicate;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bp = (i1, i2) -> i1 == i2;

		System.out.println(bp.test(3, 3));

		BiFunction<Integer, Integer, Integer> bf = (i1, i2) -> i1 + i2;

		System.out.println(bf.apply(2, 3));

		BiConsumer<Integer, Integer> bc = (i1, i2) -> System.out.println("Sum: " + (i1 + i2));

		bc.accept(2, 3);

	}

}
