package sept9;

public class Vegetable extends Food{
	
	private String growthSeason;
	private boolean isLeafy;
	
	Vegetable(String name, int calories, double price, String growthSeason, boolean isLeafy) {
		super(name, calories, price);
		this.growthSeason = growthSeason;
		this.isLeafy = isLeafy;
	}
	
	public String getGrowthSeason() {
		return this.growthSeason;
	}
	
	public boolean getIsLeafy() {
		return this.isLeafy;
	}
	
	public void testMethod() {
		System.out.println("I am inside the Vegetable class");
	}
}
