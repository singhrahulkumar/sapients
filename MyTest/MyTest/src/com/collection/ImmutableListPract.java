package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableListPract {

	public static void main(String[] args) {

		List<Character> list = new ArrayList<Character>(); 
		  
        // populate the list 
        list.add('X'); 
        list.add('Y'); 
        list.add('Z'); 
        
        List<Character> nlist = Collections.unmodifiableList(list);
        nlist.add('a');
        System.out.println(nlist);
        
        Collections.sort(list); 
        
        
	}

	private static <T> void iList(List<T> list) {
		
		

		
		
	}

}
