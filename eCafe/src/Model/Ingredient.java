package Model;

public class Ingredient {

	private int quantity;
	private float cost;
	private String name;

	/**
	 * Constructor to initialize the 
	 * quantity, cost, and name of the 
	 * ingredient
	 * @param quantity
	 * @param cost
	 * @param name
	 */
	public Ingredient(int quantity, float cost, String name) {
		this.quantity = quantity;
		this.cost = cost;
		this.name = name;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Get the cost of the ingredient
	 * @return cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Get the quantity of the ingredient
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Set the quantity of the ingredient
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Set the cost of the ingredient
	 * @param cost
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * Get the name of the ingredient
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the ingredient
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
}
