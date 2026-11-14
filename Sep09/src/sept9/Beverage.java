package sept9;

public class Beverage extends Food{

	private int caffeine;
	private char size;
	
	
	public Beverage(String name, int calories, double price, int caffeine, char size) {
		super(name, calories, price);
		this.caffeine = caffeine;
		this.size =  size;
	}
	
	public int getCaffeine() {
		return this.caffeine;
	}
	
	public char getSize() {
		return this.size;
	}

}
