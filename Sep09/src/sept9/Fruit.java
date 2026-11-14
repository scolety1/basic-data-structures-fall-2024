package sept9;

public class Fruit extends Food {
	
	protected int numSeeds;
	protected boolean isTropical;

	Fruit(String name, int calories, double price, int numSeeds, boolean isTropical) {
		super(name, calories, price);
		this.numSeeds = numSeeds;
		this.isTropical = isTropical;
	}
	
	public int getNumSeeds() {
		return this.numSeeds;
	}
	
	public boolean getIsTropical() {
		return this.isTropical;
	}
}
