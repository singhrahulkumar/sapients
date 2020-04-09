package com.geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlattenMap {

	public static void main(String[] args) {

		   // Get the map to be flattened. 
        Map<Integer, List<Integer> > map = new HashMap<>(); 
        map.put(1, Arrays.asList(1, 2)); 
        map.put(2, Arrays.asList(3, 4, 5, 6)); 
        map.put(3, Arrays.asList(7, 8, 9)); 

        System.out.println(map);
        Collection<List<Integer>> list = map.values();
        List<Integer> al = new ArrayList<>();
/*        for(List<Integer> l : list) {
        	for(Integer i : l) {
        		al.add(i);
        	}
        }*/
       
/*        for(List<Integer> l : list) {
        	l.stream().forEach(e->al.add(e));
        }*/
        
        list.stream().forEach(l->l.stream().forEach(e->al.add(e)));
        System.out.println(al);
        
	}

}
