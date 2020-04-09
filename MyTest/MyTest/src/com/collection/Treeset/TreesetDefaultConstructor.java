package com.collection.Treeset;

import java.util.TreeSet;

public class TreesetDefaultConstructor {

	public static void main(String[] args) {

		TreeSet<StringBuffer> sb = new TreeSet<>();
		sb.add(new StringBuffer("b"));
		sb.add(new StringBuffer("a"));
		System.out.println(sb);
		
		System.out.println("A".compareTo("Z"));
	}

}
