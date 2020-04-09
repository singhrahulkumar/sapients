package com.predicates;

import java.util.function.Predicate;

public class NameStartWithK {

	public static void main(String[] args) {

		Predicate<String> startsWithK = s -> s.charAt(0) == 'k';

		String[] arg = { "Abhi", "kabhi", "sabhi", "kadhi" };

		NameStartWithK n = new NameStartWithK();
		n.check(startsWithK, arg);

	}

	private void check(Predicate<String> startsWithK, String[] arg) {

		for (String s : arg) {
			if (startsWithK.test(s))
				System.out.println(s);
		}

	}

}
