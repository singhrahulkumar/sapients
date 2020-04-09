package com.inheritance;

public class OverloadingPromotion {

	public void m1(int a) {
		System.out.println("int m1--"+a);
	}
	
	public void m1(float a) {
		System.out.println("float m1--"+a);
	}
	
	public void m2(int...x) {
		System.out.println("var-args method");
	}
	
	public void m2(int x) {
		System.out.println("General method");
	}
	
	
	
	public static void main(String[] args) {

		OverloadingPromotion t = new OverloadingPromotion();
		// promotion
		t.m1('a');
		t.m1(10.4f);
	//	t.m1(10.4);
		
		t.m2(1);
		t.m2();
		t.m2(1,2);
	}

}
