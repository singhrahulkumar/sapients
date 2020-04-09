package com.Task;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

public class Address {

	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String pincode;
	private String country;

	public Address(String address1, String address2, String address3, String city, String state, String pincode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address() {

	}

	/**
	 * return map
	 * 
	 * @param address
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public Map<String, String> createFinalAddressKeyValueMap(Address address)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Map<String, String> addressList = new TreeMap<>();
		Class<?> c = address.getClass();
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			Field f = address.getClass().getDeclaredField(field.getName());
			String s = (String) f.get(address);
			if (s != null) {
				addressList.put(field.getName(), s);
			}
		}
		return addressList;
	}

	/**
	 * address.getClass().getDeclaredField(map.getKey()) restore value in respective
	 * fields
	 * 
	 * @param fullAdd
	 * @return
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public Object restoreFields(Map<String, String> fullAdd)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Address object = new Address();
		Class<?> clazz = object.getClass();
		for (Map.Entry<String, String> map : fullAdd.entrySet()) {
			Field field = clazz.getDeclaredField(map.getKey());
			field.setAccessible(true);
			field.set(object, map.getValue());
		}
		return object;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return address1 + "," + address2 + "," + address3 + "," + city + "," + state + "," + pincode + "," + country;
	}

}
