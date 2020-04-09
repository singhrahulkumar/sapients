package com.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveNullFromListUsingPredicate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("A", null, "B", null, "C"));
		Predicate<String> removeNull = item -> Objects.nonNull(item);
		removeNullList(list, removeNull);

	}

	private static void removeNullList(List<String> list, Predicate<String> removeNull) {

		List<String> nList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(nList);

		List<String> listNew = new ArrayList<>();
		for (String l : list) {
			if (removeNull.test(l)) {
				listNew.add(l);
			}
		}
		System.out.println(listNew);
	}

}
