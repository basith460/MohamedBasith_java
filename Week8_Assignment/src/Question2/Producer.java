package Question2;

public class Producer implements Runnable{

	private Thread1 t;

	public Producer(Thread1 t) {
		this.t = t;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		while (true) {
			t.serialize();
		}
	}
}

