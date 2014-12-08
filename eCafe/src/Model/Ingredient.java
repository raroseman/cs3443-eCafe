package Model;

public class Ingredient {

	private String name;
	private String description;
	private float cost;
	private int amount;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param description
	 * @param cost
	 * @param amount
	 */
	public Ingredient(String name, String description, float cost, int amount) {
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.amount = amount;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrip() {
		return description;
	}

	public void setDescrip(String descrip) {
		this.description = descrip;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	
	public String toString(){
		return name + "\nDescription: " + description +"\nCost: " + cost +"\nAmount: " + amount;
	}
}
