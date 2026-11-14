package finalQueue;


public class QueueDemo {
	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.enqueue("2025-05-03");
		pq.enqueue("2025-01-27");
		pq.enqueue("2025-10-15");
		pq.dequeue();
		pq.enqueue("2025-02-25");
		pq.enqueue("2025-03-01");
		pq.enqueue("2024-12-09");
		System.out.println("Product Queue: " + pq.priorityQueue);
		System.out.println(pq.size);
	}

}