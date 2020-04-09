package com.String;

import java.nio.charset.Charset;

public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		String s = new String(sb);
		System.out.println(s.getClass().getName());
		
		char[] ch = {100,101,102};
		String cs = new String(ch);
		System.out.println(cs.getClass().getName() + " " + cs);
		
		byte[] b = {100,101,102,103};
		String sbyte = new String(b); 
		System.out.println(sbyte);
		
		System.out.println(sbyte.charAt(2));
		
		String s1 = "  abcdefg  lkj  ";
		System.out.println(s1);
		System.out.println(s1.trim());
	
		
		final StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb2.capacity());
		sb2.append("software");
		System.out.println(sb2);
		
		System.out.println(sb2.length() + " " + sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer();
		System.out.println(sb3.capacity());
		
		StringBuffer sb4 = new StringBuffer("abhi");
		System.out.println(sb4.append(10.8));
		System.out.println(sb4.length());
		System.out.println(sb4.append(false));
		System.out.println(sb4.insert(8, true));
		System.out.println(sb4.length());
		System.out.println(sb4.reverse());
		
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity());
		sb5.ensureCapacity(1000);
		System.out.println(sb5.capacity());
		sb5.append("abc");
		sb5.trimToSize();
		System.out.println(sb5.capacity());
		
		
		byte[] b_arr = {71, 101, 101, 107, 115};
		Charset cs1 = Charset.defaultCharset();
		String s_byte_char = new String(b_arr, cs1);
		System.out.println(s_byte_char);
		
		
		
		
		

	}

}
