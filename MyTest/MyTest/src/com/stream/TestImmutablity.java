package com.stream;

import java.util.Date;

public class TestImmutablity {

	public static void main(String[] args) {

		ImmutableClass immute = new ImmutableClass(new Date(), 2);
		ImmutableClass im1 = new ImmutableClass(new Date(),2);
		System.out.println(immute);
	}

}
