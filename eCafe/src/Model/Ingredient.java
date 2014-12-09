package Model;

/**
 * Class to manipulate an ingredient
 * 
 * @author All
 *
 */
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
	/**
	 * Get the name of the ingredient.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name for an ingredient.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the description for the ingredient.
	 * @return description
	 */
	public String getDescrip() {
		return description;
	}

	/**
	 * Set the description for the ingredient.
	 * @param descrip
	 */
	public void setDescrip(String descrip) {
		this.description = descrip;
	}

	/**
	 * Get the cost of the ingredient.
	 * @return cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Set the cost for the ingredient.
	 * @param cost
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * How much of the ingredient is required.
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Set the amount for the ingredient.
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	
	/**
	 * Print the information for the ingredient.
	 * @return name, description, cost, and amount
	 */
	public String toString(){
		//Test
		return name + "\nDescription: " + description +"\nCost: " + cost +"\nAmount: " + amount;
	}
}
