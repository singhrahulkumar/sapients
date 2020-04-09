package com.myenum;

public class EnumDriver {

	public static void main(String[] args) {
		MyEnum[] b = MyEnum.values();
		for (MyEnum myEnum : b) {
			System.out.println(myEnum.price);
		}

	}

}
