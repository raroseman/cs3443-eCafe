package Model;

import java.util.ArrayList;

/**
 * Class to get and set the item for the 
 * menu special.
 * 
 * @author All
 *
 */
public class MenuSpecial {
	private MenuItem[] items;
	private float price;
	
	/**
	 * Constructor to initialize menu specials
	 * and price.
	 * @param items
	 * @param price
	 */
	public MenuSpecial(MenuItem[] items, float price){
		this.items = items;
		this.price = price;
	}

	/**
	 * Get the menu items.
	 * @return items
	 */
	public MenuItem[] getItems() {
		return items;
	}

	/**
	 * Set the menu items.
	 * @param items
	 */
	public void setItems(MenuItem[] items) {
		this.items = items;
	}

	/**
	 * Get the menu item price.
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * Set the menu item price.
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
