package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CreateAddressStatic {

	public static void main(String[] args) {

		AddressStatic address = new AddressStatic();
		address.setAddress1("Backgate");
		address.setAddress2("Global village");
		address.setAddress3("Tech Park");
		// address.setCity("Bangalore");
		address.setState("Karnataka");
		// address.setPincode("560059");
		address.setCountry("India");
		System.out.println("Appended with comma :");
		String fullAddress = address.toString();
		System.out.println(fullAddress);

		restoreVariables(fullAddress);

	}

	private static void restoreVariables(String fullAddress) {
		StringTokenizer stj = new StringTokenizer(fullAddress, ",");
		Address address = new Address();
		
		
		while (stj.hasMoreTokens()) {
			address.setAddress1(stj.nextToken());
			address.setAddress2(stj.nextToken());
			address.setAddress3(stj.nextToken());
			address.setCity(stj.nextToken());
			address.setState(stj.nextToken());
			address.setPincode(stj.nextToken());
			address.setCountry(stj.nextToken());
		}
		System.out.println("As a object :"+address);

	}

}
