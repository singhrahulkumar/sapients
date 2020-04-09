package com.test;



 abstract class TestInterface {

	int x = 10;
	public  int add(int a) {
		System.out.println("abstract");
		return 2;
	}

}
 


public class DefaultInterface extends TestInterface {

	
	public static void main(String[] args) {
		TestInterface d = new DefaultInterface();
		System.out.println(d.add(2));

	}

/*	@Override
	public int add(int a) {
		// TODO Auto-generated method stub
		return 4;
	}*/


}
