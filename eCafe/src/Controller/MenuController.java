package Controller;

import java.util.ArrayList;

import Model.Menu;
import Model.MenuItem;

public class MenuController {
	private Menu menu;
	
	/**
	 * Constructor
	 * @param menu
	 */
	public MenuController(Menu menu){
		this.menu = menu;
	}
	
	/**
	 * Fills menu with MenuItems held in outside SQL database
	 */
	public void populateMenu(){
		ArrayList<MenuItem> items = new ArrayList<MenuItem>();
		//Query SQL database
		//Create MenuItem for each entry with createMenuItem()
		//Add new MenuItem to "items"
		menu.setItems(items);
	}
	
	/**
	 * Creates a new MenuItem from parameters
	 * @param name
	 * @param description
	 * @param price
	 * @param prepTime
	 * @return MenuItem
	 */
	private MenuItem createMenuItem(String name, String description, float price, float prepTime){
		return new MenuItem(name, description, price, prepTime);
	}
}
