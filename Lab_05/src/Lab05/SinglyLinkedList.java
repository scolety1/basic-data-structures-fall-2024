package Lab05;

public class SinglyLinkedList {

	private Node head;
	private int size;

	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void addToFront(Node newMovie) {

		if (head == null) {
			head = newMovie;
		} else {

			newMovie.setNext(head);
			head = newMovie;
		}
		size++;
	}

	public void addToBack(Node newMovie) {

		if (head == null) {
			head = newMovie;
		} 
		else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newMovie);
		}
		size++;
		
	}

	public void removeFirst() {

		if (head == null) {
			System.out.println("Error: LL is empty...");
		} else {
			head = head.getNext();
		}
	}

	public void insert(Node newMovie, int N) {

		Node current = head;
		
		for(int i = 1; i < N - 1; i++) {
			current = current.getNext();
		}
		newMovie.setNext(current.getNext());
		current.setNext(newMovie);
		size ++;
	}

	public void searchForMovie(String m) {
	    Node current = head;
	    int position = 1;
	    boolean found = false;
	    while (current != null) {
	        if (current.getName().equalsIgnoreCase(m)) {
	            System.out.println("Movie: " + m +" (" + current.getYear() + ")" + " was found at spot #" + position);
	            found = true;
	            break;
	        }
	        current = current.getNext();
	        position++;
	    }
	    if (!found) {
	        System.out.println("Movie: " + m + " was not found");
	    }
	}
	
	public int getSize() {
		return size - 1;
	}
	
	public void printList() {

		int i = 1;
		Node current = this.head;
		while (current != null) {

			System.out.println(i + ". " +current.getData());
			current = current.getNext();
			i ++;
		}
	}
}
