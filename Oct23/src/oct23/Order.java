package oct23;

public class Order {

	private String name;
	private String entree;
	private String drink;
	private String diningWith;
	
	public Order(String n, String e, String d, String dw) {
		this.name = n;
		this.entree = e;
		this.drink = d;
		this.diningWith = dw;
	}

	public String toString() {
		return "Order Name: " + this.name + "\n" + "Entree: " + this.entree + "\n" + "Drink: " + this.drink + "\n" + "Dining with: " + this.diningWith + "\n";
	}

	public String getName() {
		return this.name ;
	}
}
