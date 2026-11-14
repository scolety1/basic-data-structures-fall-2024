
public class Item {
	private String name;
	private double price;
	private double[] scores;
	
	public Item(String inName, double inPrice, double[] inScores) {
		this.name = inName;
		this.price = inPrice;
		this.scores = inScores;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}
	
	public double setPrice(double newPrice) {
		this.price = newPrice;
		return newPrice;
	}
	
	public double getAverageRating() {
		double sum = 0;
		for(double d: this.scores) {
			sum += d;
		}
		double answer = sum / this.scores.length; 
		return answer;
	}	 
	
}
