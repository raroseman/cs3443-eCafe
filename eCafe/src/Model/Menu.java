package Model;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> items;
	private ArrayList<MenuSpecial> specials;

	public Menu() {
		// Do nothing
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	public ArrayList<MenuItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public ArrayList<MenuSpecial> getSpecials() {
		return specials;
	}

	public void setSpecials(ArrayList<MenuSpecial> specials) {
		this.specials = specials;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
}
