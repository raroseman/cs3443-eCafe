package Model;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> items;
	private ArrayList<MenuSpecial> specials;

	public Menu() {
		// Do nothing
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Get menu items
	 * @return items
	 */
	public ArrayList<MenuItem> getItems() {
		return items;
	}

	/**
	 * Set menu items
	 * @param items
	 */
	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	/**
	 * Get the specials from menu
	 * @return specials
	 */
	public ArrayList<MenuSpecial> getSpecials() {
		return specials;
	}

	/**
	 * Set the menu specials
	 * @param specials
	 */
	public void setSpecials(ArrayList<MenuSpecial> specials) {
		this.specials = specials;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
}
