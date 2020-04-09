import java.util.LinkedList;

public class ProducerConsumer {

	static LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;
	

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		Runnable p = () -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
			}
		};

		Runnable c = () -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
			}
		};

		Thread producer = new Thread(p);
		Thread consumer = new Thread(c);

		producer.start();
		consumer.start();
	}

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				if (list.size() == capacity) {
					wait();
				} else {

					list.add(value++);
					System.out.println(list);
					Thread.sleep(1000);
					notify();
				}
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 0)
					wait();
				else {
					list.removeFirst();
					System.out.println(list);
					Thread.sleep(1000);
					notify();
				}
			}
		}
	}

}
