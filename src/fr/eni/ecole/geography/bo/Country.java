package fr.eni.ecole.geography.bo;

public class Country {

	private String name;
	private int area; // in square-kilometers
	private float population; // in thousands of inhabitants
	
	public Country(String name, int area, float population) {
		this.name = name;
		this.area = area;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public int getArea() {
		return area;
	}

	public float getPopulation() {
		return population;
	}

	public void setPopulation(float population) {
		this.population = population;
	}

	@Override
	public String toString() {
		String resultat = "";

		resultat += getName();

		resultat += " (";
		resultat += getArea();
		resultat += " km2";
		
		resultat += " for ";
		resultat += getPopulation();
		resultat += " 000 inhab.)";
			
		return resultat;
	}
}
