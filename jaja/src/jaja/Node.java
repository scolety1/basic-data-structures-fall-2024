package jaja;

public class Node {

	private Item item;
	private Node next;
	
	public Node(Item i) {
		this.item = i;
		this.next = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
}
