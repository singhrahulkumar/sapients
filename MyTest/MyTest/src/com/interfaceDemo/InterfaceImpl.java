package com.interfaceDemo;

public class InterfaceImpl implements InterfaceDemo {

	
	
	
	public static void main(String[] args) {
		int x = 2;
		InterfaceImpl i = new InterfaceImpl();
		i.m1();
		
	}
	@Override
	public void m1() {
		System.out.println("method m1 " + InterfaceDemo.x);
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
