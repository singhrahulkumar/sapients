package com.thread;

class A {
	public synchronized void aMethod(B b) {
		System.out.println("Inside A method");

		System.out.println("Calling B Last method");
		b.last();

	}

	public synchronized void last() {
		System.out.println("Inside A last method");
	}
}

class B {
	public synchronized void bMethod(A a) {
		System.out.println("Inside B method");

		System.out.println("Calling A Last method");

		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B last method");
	}
}

public class Deadlock extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		b.bMethod(a);
	}

	public void run() {
		a.aMethod(b);
	}

	public static void main(String[] args) {

		Deadlock d = new Deadlock();
		d.m1();

	}

}
