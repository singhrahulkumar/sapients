package com.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {

		Predicate<String> p = s -> s.length() > 5;
		System.out.println(p.test("Abhishek"));
		System.out.println(p.test("aa"));

		Predicate<Collection> a = aList -> aList.isEmpty();
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(a.test(al));

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		System.out.println(a.test(al1));
	}

}
