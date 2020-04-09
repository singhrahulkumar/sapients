package com.Generics;

import java.util.ArrayList;

public class TypeSafeAndTypeCasting {

	public static void main(String[] args) {

		String[] str = new String[5];
		str[0] = "Abc";
		str[1] = "Abcd";

		// type safety and type casting is not required
		String s1 = str[0];
		System.out.println(s1);

		ArrayList l = new ArrayList();
		l.add("Abhi");
		// type safety is not there any type can be inserted
		l.add(Integer.valueOf(10));

		// type casting is required
		String l1 = (String) l.get(0);
		// show runtime exception if (String is there)
		Integer l2 = (Integer) l.get(1);
		System.out.println(l1+".."+l2);
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Abhis");
		// if integer value will be inserted then it will show compile time exception
		al.add("pras");
		
		for(String s :al) {
			System.out.print(s+"  ");
		}
		

	}

}
