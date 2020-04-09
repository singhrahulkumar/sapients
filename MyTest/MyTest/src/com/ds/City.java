package com.ds;

import java.util.HashMap;
import java.util.Map;

public class City {

	String name;

	@Override
	public int hashCode() {
		return 1;

	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String[] args) {

		City c1 = new City();
		City c2 = new City();
		City c3 = new City();
		Map<City, String> map = new HashMap<>();
		map.put(c1, "Ranchi");
		map.put(c2, "Delhi");
		System.out.println(map.get(c3));
	}

}
