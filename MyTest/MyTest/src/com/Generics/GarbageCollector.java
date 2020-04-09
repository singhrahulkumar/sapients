package com.Generics;

import java.util.Date;

public class GarbageCollector {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		System.out.println("Total memory :" + r.totalMemory());
		System.out.println("Free memory :" + r.freeMemory());
		for (long i = 0; i <= 10000; i++) {
			Date d = new Date();
			// d = null;
		}
		System.out.println("Free memory before gc :" + r.freeMemory());
		r.gc();
		System.out.println("Free memory after gc :" + r.freeMemory());
	}
}
