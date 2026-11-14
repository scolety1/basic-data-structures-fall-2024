package exam;


public class Node {

	private String name;
	private Node next;
	private Node prev;
	
	public Node(String c) {
		
		this.name = c;
		this.next = null;
		this.prev = null;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public void setPrev(Node newNode) {
		this.prev = newNode;
	}
}
