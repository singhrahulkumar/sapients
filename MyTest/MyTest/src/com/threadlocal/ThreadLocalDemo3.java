package com.threadlocal;

class ParentThread extends Thread {

	static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue(Object parentValue) {
			return "cc";
		}
	};

	@Override
	public void run() {
		tl.set("pp");
		System.out.println("Parent thread value in parent class:" + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread {
	public void run() {
		System.out.println("Parent thread local value in child class: " + ParentThread.tl.get());
	}
}

public class ThreadLocalDemo3 {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}

}
