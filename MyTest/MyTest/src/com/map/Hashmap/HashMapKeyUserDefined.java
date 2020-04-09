package com.map.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

public class HashMapKeyUserDefined {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<>();
		
		Student s = new Student(1, "aaa");
		Student s1 = new Student(1, "aaa");
		
		
		System.out.println(s);
		
	
		
		System.out.println(s);
	/*	
		map.put(new Student(1, "aaa"), 1);
		map.put(new Student(2, "bbb"), 2);
		*/
		/*System.out.println(map.get(new Student(1,"aaa")));*/
		
//		System.out.println(s.hashCode()+" "+s1.hashCode());
		
		
		
		
		
	}

}
