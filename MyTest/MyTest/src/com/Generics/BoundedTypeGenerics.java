package com.Generics;

class Test<T extends Number> {

}

// bounded example for Interface
class TestInterface<T extends Runnable> {

}

public class BoundedTypeGenerics {

	public static void main(String[] args) {

		Test<Integer> t = new Test<Integer>();
		Test<Double> t1 = new Test<Double>();
		// below syntax will give error as bound error because Test class is bounded
		// with number class
		//Test<String> t2 = new Test<String>();

		TestInterface<Runnable> tI = new TestInterface<>();
		TestInterface<Thread> tI1 = new TestInterface<>();
		// bounded error
		// TestInterface<String> tI2 = new TestInterface<String>();

	}

}
