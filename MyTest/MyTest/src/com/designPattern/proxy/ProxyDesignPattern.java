package com.designPattern.proxy;

public class ProxyDesignPattern {

	public static void main(String[] args) {

		DBExecutorProxy db = new DBExecutorProxy("abhi", "aaa");
		db.extecuteDB("deleteQuery");
		db.extecuteDB("insertQuery");

		DBExecutorProxy db1 = new DBExecutorProxy("abhi", "abhi");
		db1.extecuteDB("deleteQuery");
	}

}
