package finalQueue;

import java.util.LinkedList;
import java.util.Collections;

public class PriorityQueue {

	LinkedList<String> priorityQueue;
	int size;
	
	public PriorityQueue() {
		this.priorityQueue = new LinkedList<String>();
		this.size = 0;
	}
	
	public void enqueue(String newFood) {
		priorityQueue.add(newFood);
		Collections.sort(priorityQueue);
		size++;
	}
	
	public void dequeue() {
		String removed = priorityQueue.removeFirst();
		System.out.println("Patient removed " + removed);
		size--;
	}
	
	public String peek() {
		return priorityQueue.getFirst();
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
}
