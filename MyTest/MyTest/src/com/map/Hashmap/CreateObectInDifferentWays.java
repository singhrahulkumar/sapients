package com.map.Hashmap;

import com.map.Hashmap.Student;

public class CreateObectInDifferentWays  {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

		// using new instance
		Class c = Class.forName("com.map.Hashmap.Student");
		Student obj = (Student) c.newInstance();
		System.out.println(obj);
		
		// using clone
		Student s = new Student(1,"abc");
		Student s1 = s.clone();
		System.out.println(s1);
		System.out.println(s1 == s);
	}
}
