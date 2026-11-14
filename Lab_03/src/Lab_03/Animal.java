package Lab_03;

public abstract class Animal {

	protected String species;
	protected double weight;
	protected String continent;
	protected int population;
	
	public Animal(String species, double weight, String continent, int population) {
		
		this.species = species;
		this.weight = weight;
		this.continent = continent;
		this.population = population;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getContinent() {
		return this.continent;
	}

	public int getPopulation() {
		return this.population;
	}

	public String checkPopulation() {

		if(population <= 2500) {
			System.out.println("This animal is endangered!");
		}
		return "" + getPopulation();
	}

	public abstract void makeSound();
}
