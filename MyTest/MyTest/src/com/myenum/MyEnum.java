package com.myenum;

enum MyEnum {
	
	aa(75),bb(90),cc(95),dd;
	int price;
	
	MyEnum(int price){
		this.price = price;
	}
	
	private MyEnum() {
		this.price = 65;
	}
	
	public int getPrice() {
		return price;
	}
}
