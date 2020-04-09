package com.collection.copyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cowal {

	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();

	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> {
			l.add("c");
		};

		Thread t = new Thread(r);
		l.add("a");
		l.add("b");
		t.start();

		Thread.sleep(3000);
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println("Element :" + i.next());
		}
	}

}
