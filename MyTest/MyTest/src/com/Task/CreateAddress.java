package com.Task;

import java.util.Map;
import java.util.StringJoiner;

public class CreateAddress {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Address address = new Address();
		address.setAddress1("GlobalVillage");
		address.setAddress2("TechPark");
		address.setAddress3("BackGate");
		address.setCity("Bangalore");
		address.setPincode("560059");
		address.setCountry("India");

		Map<String, String> fullAdd = address.createFinalAddressKeyValueMap(address);
		StringBuilder fullAddr =createFullAddressFromMap(fullAdd);
		System.out.println("Address as final string  :"+fullAddr.toString());
		
		Address addressRestored = (Address)address.restoreFields(fullAdd);
		System.out.println("address as object  :"+addressRestored);
		
	}

	/**
	 * change map value in trailing comma
	 * @param fullAdd
	 * @return
	 */
	private static StringBuilder createFullAddressFromMap(Map<String, String> fullAdd) {

		StringBuilder fullAddress = new StringBuilder();
		for(Map.Entry<String,String> map : fullAdd.entrySet()) {
			fullAddress.append(map.getValue());
			fullAddress.append(",");
		}
		fullAddress.setLength(fullAddress.length()-1);
		return fullAddress;
	}

}
