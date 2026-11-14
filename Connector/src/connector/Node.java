package connector;

public class Node {

	private String name;
	private int age;
	private String favoriteColor;
	private String favoriteFlower;
	private String favoriteGift;	
	private String favoritePlace;
	
	private Node next;
	private Node prev;
	
	
	public Node(String n, int a, String fc, String ff, String fg, String fp) { 
		this.name = n;
		this.age = a;
		this.favoriteColor = fc;
		this.favoriteFlower = ff;
		this.favoriteGift = fg;
		this.favoritePlace = fp;
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
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getColor() {
		return this.favoriteColor;
	}
	
	public String getFlower() {
		return this.favoriteFlower;
	}
	
	public String getGift() {
		return this.favoriteGift;
	}
	
	public String getPlace() {
		return this.favoritePlace;
	}
	
    public String getData() {
        return "Name: " + this.name + ", Age: " + this.age + 
               ", Favorite Color: " + this.favoriteColor +
               ", Favorite Flower: " + this.favoriteFlower +
               ", Favorite Gift: " + this.favoriteGift +
               ", Favorite Place: " + this.favoritePlace;
    }
	
	
	
}
