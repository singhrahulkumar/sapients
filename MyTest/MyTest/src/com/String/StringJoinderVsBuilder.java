package com.String;

import java.util.StringJoiner;

public class StringJoinderVsBuilder {
	public static void main(String[] args) {
		
		String[] str = {"Ram","Shyam","Bob"};
		
		StringJoiner stj = new StringJoiner(":","[","]");
		for(String s : str) {
			stj.add(s);
		}
		System.out.println(stj.toString());
		
		StringBuilder sbr = new StringBuilder();
		sbr.append("[");
		sbr.append(str[0]);
		for(int i =1 ; i<str.length;i++) {
			sbr.append(":").append(str[i]);
		}
		sbr.append("]");
		System.out.println(sbr.toString());	
	}
}
