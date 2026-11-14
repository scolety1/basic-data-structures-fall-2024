package oct23;

public class QueueArrayDemo {

	public static void main(String[] args) {
		Order o1 = new Order("Reese", "Cookie", "Coffee", "Noone");
		Order o2 = new Order("Iliana", "Sandwhich", "Latte", "Noone, loser");
		Order o3 = new Order("Evan", "Cinnamon Roll", "Tea", "Noone, chill");
		Order o4 = new Order("John", "Muffin", "Milk", "Noone, loser");
		Order o5 = new Order("Spencer", "Tacos", "Tequila", "Lily & Jameson");
		Order o6 = new Order("Jameson", "Tacos", "Tequila", "Lily & Spencer");
		Order o7 = new Order("Lily", "Tacos", "Tequila", "Spencer & Jameson");
		
		QueueArray queue = new QueueArray(6);
		
		queue.enqueue(o1);
		queue.enqueue(o2);
		queue.enqueue(o3);
		
		queue.printQueue();
		
		System.out.println("-----------------------");
		Order removed = queue.dequeue();
		System.out.println(removed);
		
		System.out.println("-----------------------");
		queue.enqueue(o4);
		queue.printQueue();
		
		System.out.println("------------------------");
		queue.enqueue(o5);
		queue.enqueue(o6);
		queue.enqueue(o7);
		
		queue.printQueue();
		
		System.out.println("------------------------");
		queue.dequeue();
		
		


	}

}
