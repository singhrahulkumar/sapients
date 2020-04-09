package com.String;

public class GeneralMethodsString {

	public static void main(String[] args) {

		String s = "My name is Abhishek";
		
		int i = s.indexOf("is");
		System.out.println(i);
		
		boolean b = s.contains("is");
		System.out.println(b);
		
		System.out.println(s.startsWith("My"));
		System.out.println(s.startsWith("name",3));
		System.out.println(s.endsWith("Abhish"));
		
		

	}

}
