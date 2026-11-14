package queue;


public class CarQueue {

	private Car[] data;
	private int size;
	private int front;
	private int rear;
	private int carsServiced;
	private double earnings;
	
	
	public CarQueue(int capacity) {
		this.data = new Car[capacity];
		this.size = 0;
		this.front = 0;
		this.rear = -1;
		this.carsServiced = 0;
		this.earnings = 0;
		
	}
	
	public void enqueue(Car newCar) {
		if(size == data.length) {
			System.out.println("Error: Queue is full - Cannot add " + newCar.toString());
		}
		else {
			rear = (rear + 1) % data.length;
			size++;
			data[rear] = newCar;
			System.out.println("Adding " + newCar.toString() + " to the queue");
			
		}
		
	}
	
	public Car dequeue() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return null;
		}
		Car removed = data[front];
		front = (front + 1) % data.length;
		size--;
		if (removed.getVIP() == true) {
			earnings += 10;
			carsServiced ++;
		}
		else {
			earnings += 6;
			carsServiced ++;
		}
		System.out.println("Car has been washed - Removing " + removed.toString() +" from the queue");
		return removed;
	}

	public Car peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty - No cars to view");
            return null;
        } else {
            return data[front];
        }
    }
	
	public void printStats() {
		System.out.println("Current Wash Statistics");
		System.out.println("----------------------");
		System.out.println("Number of cars serviced: " + carsServiced);
		System.out.println("Today's earnings:  $" + earnings);
		
		
		
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	public void printQueue() {
	
		if(size == 0) {
			System.out.println("Car wash is empty");
		}
		System.out.println("Current Car Wash Queue");
		System.out.println("----------------------");
		for(int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            System.out.println((i + 1) + ". " + data[index].toString());		}
		
	}

	
}
