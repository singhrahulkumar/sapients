package com.innerClass.AnonymousInnerClass;

class Popcorn {
	public void taste() {
		System.out.println("Sweet");
	}
}

public class ExtendsAClass {

	public static void main(String[] args) {

		// creating a anonymous class
		// 1> Which extends a class
		// 2> Have Parent reference
		// 3> and we cannot declare new method in it
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("Salty");
			}
		};

		p.taste();
		System.out.println(p.getClass().getName());
		Popcorn p1 = new Popcorn();
		p1.taste();

	}

}
