package labe_08;

public class Car {

	private String make;
	private String owner;
	private boolean vip;
	
	public Car(String m, String o, boolean v) {
		this.make = m;
		this.owner = o;
		this.vip = v;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public boolean getVip() {
		return this.vip;
	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return getMake() + " (" + getOwner() + ")";
	}
	
	public String toString( ) {
		return getInfo();
	}
}