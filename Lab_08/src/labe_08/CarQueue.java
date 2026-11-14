package labe_08;

public class CarQueue {

	private Car[] data;
	private int front;
	private int rear;
	private int size;
	private int carsServiced;
	private double earnings;
	
	public CarQueue(int capacity) {
		data = new Car[capacity];
		front = 0;
		rear = -1;
		size = 0;
		carsServiced = 0;
		earnings = 0.0;
	}
	
	public boolean isFull() {
        return size == data.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(Car car) {
		if (isFull()) {
			System.out.println("Error: Queue is full - Cannot add " + car.getInfo());
		}
		else { 
			rear = (rear + 1) % data.length;
			data[rear] = car;
			size++;
			System.out.println("Adding " + car.getInfo() + " to the queue");
		}
	}
	
	public Car dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty - No cars to remove");
            return null;
        } else {
            Car car = data[front];
            front = (front + 1) % data.length;
            size--;
            carsServiced++;
            earnings += car.getVip() ? 10.0 : 6.0;
            System.out.println("Car has been washed - Removing " + car.getInfo() + " from the queue");
            return car;
        }
    }	
	
    public Car peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty - No cars to view");
            return null;
        } else {
            return data[front];
        }
    }
    
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Current Car Wash Queue");
        System.out.println("----------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            System.out.println((i + 1) + ". " + data[index].getInfo());
        }
    }
    
    public void printStats() {
        System.out.println("Car Wash Statistics");
        System.out.println("-------------------");
        System.out.println("Number of cars serviced: " + carsServiced);
        System.out.println("Today's earnings: $" + earnings);
    }
}
