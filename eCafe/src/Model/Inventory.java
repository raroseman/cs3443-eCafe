package Model;

import java.util.ArrayList;

/**
 * Class that stores information on an ingredient
 * 
 * @authors All
 *
 */
public class Inventory {
	private ArrayList<Ingredient> ingredients;

	/**
	 * Constructor
	 */
	public Inventory() {
		ingredients = new ArrayList<Ingredient>();
	}

	/**
	 * Get the ingredients from the array list
	 * @return ingredients
	 */
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * Set the ingredients
	 * @param ingredients
	 */
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Add a new ingredient to the inventory
	 * 
	 * @param name
	 * @param description
	 * @param cost
	 * @param amount
	 */
	public void addIngredient(String name, String description, float cost,
			int amount) {
		ingredients.add(new Ingredient(name, description, cost, amount));
	}

	/**
	 * Add a new ingredient to the inventory
	 * 
	 * @param ingredient
	 */
	public void addMenuItem(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

}
