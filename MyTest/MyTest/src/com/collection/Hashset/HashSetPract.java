package com.collection.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetPract {

	public static void main(String[] args) {

		HashSet<Integer> h= new HashSet<>();
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(99);
		h.add(7);
		h.add(6);
		h.add(8);
		
		Collections.sort(new ArrayList<>(h));
				
		System.out.println(h);
		
	}

}
