package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {

        //reverse list in descending order
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(30); 
        al.add(20); 
        al.add(10); 
        al.add(40); 
        al.add(50); 
        
        Iterator<Integer> itr = al.iterator();
        
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        
        // by array
        Integer[] arr = {50, 40, 30, 20, 10};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        
        
	}

}
