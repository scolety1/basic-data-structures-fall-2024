package Lab05;

public class Node {

	private String name;
	private int year;
	private Node next;
	
	public Node(String n, int y) {
		this.name = n;
		this.year = y;
		this.next = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getData() {
		return this.name + " (" + this.year + ")";
	}

	public int getYear() {
		return this.year;
	}
	
	
}
