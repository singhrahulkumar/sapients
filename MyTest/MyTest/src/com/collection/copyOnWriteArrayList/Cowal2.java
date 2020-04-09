package com.collection.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Cowal2 {

	static ArrayList al = new ArrayList();

	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			al.add("c");
		};

		Thread t = new Thread(r);
		al.add("a");
		al.add("b");
		t.start();

		
		Iterator i = al.iterator();
		while (i.hasNext()) {
			Thread.sleep(3000);
			System.out.println("Element :" + i.next());
		}
	}

}
