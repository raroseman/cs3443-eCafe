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
	 * 
	 * @return items
	 */
	public ArrayList<MenuItem> getItems() {
		return items;
	}

	/**
	 * Set menu items
	 * 
	 * @param items
	 */
	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}

	/**
	 * Add an item to the menu
	 * 
	 * @param item
	 */
	public void addItem(MenuItem item) {
		items.add(item);
	}

	/**
	 * Get the specials from menu
	 * 
	 * @return specials
	 */
	public ArrayList<MenuSpecial> getSpecials() {
		return specials;
	}

	/**
	 * Set the menu specials
	 * 
	 * @param specials
	 */
	public void setSpecials(ArrayList<MenuSpecial> specials) {
		this.specials = specials;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~UTILITY
	/**
	 * Add a new menu item to the menu
	 * 
	 * @param name
	 * @param description
	 * @param price
	 * @param prepTime
	 */
	public void addMenuItem(String name, String description, float price,
			float prepTime) {
		items.add(new MenuItem(name, description, price, prepTime));
	}

	/**
	 * Add a new menu item to the menu
	 * 
	 * @param item
	 */
	public void addMenuItem(MenuItem item) {
		items.add(item);
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~UTILITY

}
