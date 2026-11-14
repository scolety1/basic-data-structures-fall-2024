package dec04;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		
		GenericLinkedList ll = new GenericLinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		ll.add("Reese");
		ll.add("Spencer");
		ll.add("Lily");
		ll.add("Jameson");
		
		ll.print();
	}
}
