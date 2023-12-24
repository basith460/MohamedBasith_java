package Question2;

import java.util.ArrayList;
import java.util.HashMap;

public class Thread1 {

	private HashMap<Project, ArrayList<Employee>> map;
	private static final int MAX_ITERATIONS = 5; // Adjust this as needed
	private int iterationCounter = 0;

	public Thread1(HashMap<Project, ArrayList<Employee>> map) {
		this.map = map;
	}

	public synchronized void serialize() {
		while (iterationCounter < MAX_ITERATIONS) {
			System.out.println("Serialize called by Producer");
			System.out.println("Serialized Data :");
			System.out.println(map);
			iterationCounter++;
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void deserialize() {
		while (iterationCounter < MAX_ITERATIONS) {
			System.out.println("DeSerialize Called by Consumer");
			System.out.println("DeSerialized Data" + map);
			iterationCounter++;
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
