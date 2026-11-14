package Sept20;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		System.out.println(ll.get(1).getData());
		
		ll.addToFront( new Node("Reese", 32));
		ll.addToFront( new Node("Sally", 19));
		ll.addToFront( new Node("John", 51));
		
		ll.addToBack( new Node("Parker", 33));
		
		ll.printLinkedList();
		System.out.println();
		ll.removeFirst();
		ll.printLinkedList();
		
		System.out.println();
		ll.removeLast();
		ll.printLinkedList();
		

		
		
	}

}

