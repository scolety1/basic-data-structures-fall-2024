package program_4;

public class Customer {

	private String name;
	private String order;
	private long timeEntered;
	
	public Customer(String n, String o) {
		this.name = n;
		this.order = o;
		this.timeEntered = System.nanoTime();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getOrder() {
		return this.order;
	}
	
	public long getTimeEntered() {
		return this.timeEntered;
	}
}
