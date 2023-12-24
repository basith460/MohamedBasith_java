package Question2;

public class Consumer implements Runnable {
	private Thread1 t;

	public Consumer(Thread1 t) {
		this.t = t;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while (true) {
			t.deserialize();
		}
	}
}
