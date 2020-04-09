package com.prepare;

public class OddEven {

	public static void main(String[] args) {

		OEPrint oe = new OEPrint();
		oe.odd = true;
		Runnable r1 = () -> {
			oe.printEven();
		};

		Runnable r2 = () -> {
			oe.printOdd();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

class OEPrint {

	boolean odd;
	int count = 1;
	int max = 20;

	public void printOdd() {
		synchronized (this) {
			while (count < 20) {
				while (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				System.out.print(count + " ");
				odd = false;
				count++;
				notify();
			}
		}
	}

	public void printEven() {

		synchronized (this) {
			while (count < 20) {
				while (odd) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				System.out.print(count + " ");
				odd = true;
				count++;
				notify();
			}
		}

	}

}
