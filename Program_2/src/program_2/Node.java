package program_2;

public class Node {

	private Node next;
	private Node prev;
	
	private String title;
	private String composer;
	private String musicPath;
	
	public Node(String t, String c, String mP) {
		this.title = t;
		this.composer = c;
		this.musicPath = mP;
		this.next = null;
		this.prev = null;
	}
	
	public Node getNext() {
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
	
	public String getTitle() {
		return this.title;
	}	
	
	public String getComposer() {
		return this.composer;
	}	
	
	public String getMusicPath() {
		return this.musicPath;
	}	
	
	public String getData() {
		return this.title + " by " + this.composer;
	}
	
}
