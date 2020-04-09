package com.String;
import java.util.ArrayList;
import java.util.StringJoiner;
public class StringJoinerPract {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ram");
		al.add("Shyam");
		al.add("Alice");
		al.add("Bob");
		
		
		StringJoiner stj1 = new StringJoiner(",");
		
		stj1.setEmptyValue("sj1 is empty");
		System.out.println(stj1.toString());
		stj1.add(al.get(0)).add(al.get(1));
		System.out.println(stj1.toString());
		
		StringJoiner stj2 = new StringJoiner(":");
		stj2.add(al.get(2)).add(al.get(3));
		System.out.println(stj2.toString());
		
		stj2.merge(stj1);
		System.out.println(stj2);
	}

}
