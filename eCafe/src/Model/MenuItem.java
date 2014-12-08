package Model;

public class MenuItem {
	private String name;
	private String description;
	private float price;
	private float prepTime;

	/**
	 * Constructor to initialize the name, description,
	 * price, and preparation time of a menu item.
	 * @param name
	 * @param description
	 * @param price
	 * @param prepTime
	 */
	public MenuItem(String name, String description, float price, float prepTime) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.prepTime = prepTime;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Get the Name of the menu item
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the menu item
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the description of the menu item
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description for the menu item
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the price for the menu item
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * Set the price for the menu item
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * Get the preparation time for the
	 * menu item.
	 * @return prepTime
	 */
	public float getPrepTime() {
		return prepTime;
	}

	/**
	 * Set the preparation time for the menu item
	 * @param prepTime
	 */
	public void setPrepTime(float prepTime) {
		this.prepTime = prepTime;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	
	public String toString(){
		//Test
		return name + "\nDescription: " + description +"\nPrice: " + price +"\nPrep Time: " + prepTime;
	}
}
