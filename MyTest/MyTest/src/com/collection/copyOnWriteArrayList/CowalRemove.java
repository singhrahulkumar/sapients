package com.collection.copyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CowalRemove {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			itr.remove();
		}
	}

}
