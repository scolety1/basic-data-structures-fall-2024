package lab_06;

public class Node {

	private String location;
	private String continent;
	private int elevation;
	
	private Node next;
	private Node prev;
	
	public Node(String l, String c, int e) {
		this.location = l;
		this.continent = c;
		this.elevation = e;
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
	
	public String getLocation() {
		return this.location;
	}
	
	public String getContinent() {
		return this.continent;
	}
	
	public int getElevation() {
		return this.elevation;
	}
	
    public String getData() {
        return this.location + " (" + this.continent + ") Elevation: " + this.elevation;

    }	
}
