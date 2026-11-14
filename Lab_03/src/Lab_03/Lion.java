package Lab_03;

public class Lion extends Animal{
	
	private int size;
	
	public Lion(String species, double weight, String continent, int population, int size) {
		super(species, weight, continent, population);
		this.size = size;
	}
	
	public int getPackSize() {
		return this.size;
	}
	public void makeSound() {
		System.out.println("The " + this.getSpecies() + " goes Roarrr!");
	}
	
}
