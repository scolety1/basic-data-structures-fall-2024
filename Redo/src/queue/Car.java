package queue;

public class Car {
	
	private String model;
	private String name;
	private boolean vip;
	
	public Car(String m, String n, boolean vip) {
		this.model = m;
		this.name = n;
		this.vip = vip;
	}
	@Override
	public String toString() {
		return this.model + " (" + this.name + ")";
	}
	public boolean getVIP() {
		return this.vip;
	}
}
