package com.jvm.architecture;

public class HeapMemory {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		double mb = 1024 * 1024;
		System.out.println(r.maxMemory() / mb + " MB");
		System.out.println(r.totalMemory() / mb + " MB");
		System.out.println(r.freeMemory() / mb + " MB");
		System.out.println("Used memory : " + (r.totalMemory() - r.freeMemory()) / mb + " MB");
		
	}
}
