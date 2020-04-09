package com.collection;

import java.util.*;

public class Singleton {

	public static void main(String[] args) {
		String[] geekslist = { "1", "2", "4", "2", "1", "2", "3", "1", "3", "4", "3", "3" };
		
		List<String> lists = new ArrayList<>(Arrays.asList(geekslist));
		
	//	lists.remove("2");
		
		System.out.println(lists);
		
		Set<String> set = Collections.singleton("1");
		lists.removeAll(set);
		System.out.println(lists);

	}

}
