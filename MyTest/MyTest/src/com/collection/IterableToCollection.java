package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class IterableToCollection {

	public static void main(String[] args) {

		Iterable<Integer> itr = Arrays.asList(1, 2, 3, 4);
		System.out.println(itr);

		Collection<Integer> cn = getCollectionViaIterable(itr);
		System.out.println(cn);

		Collection<Integer> cn1 = getCollectionViaIterableUsingStream(itr);
		System.out.println(cn1);

	}

	private static <T> Collection<T> getCollectionViaIterableUsingStream(Iterable<T> itr) {

		Collection<T> cn1 = new ArrayList<T>();
		cn1 = StreamSupport.stream(itr.spliterator(), false).collect(Collectors.toList());
		return cn1;
	}

	private static <T> Collection<T> getCollectionViaIterable(Iterable<T> itr) {

		Collection<T> cn = new ArrayList<T>();

		Iterator<T> iterator = itr.iterator();

		while (iterator.hasNext()) {
			cn.add(iterator.next());
		}
		return cn;
	}

}

