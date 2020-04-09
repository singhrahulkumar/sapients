package com.map.Hashmap;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.Set;

public class EnumMapPract {

	public static void main(String[] args) {

		EnumMap<GFG, String> eMap =  new EnumMap<>(GFG.class);
		eMap.put(GFG.mon, "A");
		eMap.put(GFG.tue, "B");
		eMap.put(GFG.wed, "C");
		eMap.put(GFG.mon, "D");
		System.out.println(eMap);
		
		Collection c = eMap.keySet();
		System.out.println(c);
		System.out.println(eMap.values());
		Set<Entry<GFG, String>> e = eMap.entrySet();
		System.out.println(e);
	}

}


enum GFG{
	mon,tue,wed,thurs,fri
};