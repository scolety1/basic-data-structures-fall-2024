
public class Customer {
	private String name;
	private Item[] items;
	
	public Customer(String inName, Item[] inItems) {
		this.name = inName;
		this.items = inItems;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCartCost() {
		double sum = 0;
		for(Item item: this.items) {
			sum += item.getPrice();
		}
		double answer = sum;
		return answer;
	}

	public void applyDiscounts() {
		for (Item item : this.items) {
			if (item.getPrice() >= 200) {
				item.setPrice(item.getPrice() * .8);
			}
		}
		
	}
	
	
}