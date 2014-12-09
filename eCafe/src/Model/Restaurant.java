package Model;

import java.util.ArrayList;

/**
 * Class to manage everything about the restaurant
 * including the menu, inventory, and account.
 * @author All
 *
 */
public class Restaurant {
	private String name;

	private Menu menu;
	private Inventory inventory;
	private Account account;

	private ArrayList<Order> queue;
	private Table[] tables;

	/**
	 * Constructor to initialize the name to name.
	 * @param name
	 */
	public Restaurant(String name) {
		this.name = name;
		menu = new Menu();
		inventory = new Inventory();
		account = new Account();
		queue = new ArrayList<Order>();
	}
	
    /**
     * Constructor that initialize the name
     * and the number of tables.
     * @param name
     * @param numTables
     */
	public Restaurant(String name, int numTables) {
		this.name = name;
		menu = new Menu();
		inventory = new Inventory();
		account = new Account();
		createTables(numTables);
		queue = new ArrayList<Order>();
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Get the restaurant name.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the restaurant name.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the menu.
	 * 
	 * @return menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * Set the menu.
	 * 
	 * @param menu
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	/**
	 * Get the inventory.
	 * 
	 * @return inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * Set the inventory.
	 * 
	 * @param inventory
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	/**
	 * Get the account.
	 * 
	 * @return account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * Set the account.
	 * 
	 * @param account
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * Get the order queue.
	 * 
	 * @return queue
	 */
	public ArrayList<Order> getQueue() {
		return queue;
	}

	/**
	 * Set the order queue.
	 * 
	 * @param queue
	 */
	public void setQueue(ArrayList<Order> queue) {
		this.queue = queue;
	}

	/**
	 * Get the tables.
	 * 
	 * @return tables
	 */
	public Table[] getTables() {
		return tables;
	}

	/**
	 * Set the number of tables.
	 * 
	 * @param tables
	 */
	public void setTables(Table[] tables) {
		this.tables = tables;
	}

	/**
	 * Get the number of tables
	 * 
	 * @return number of tables
	 */
	public int getNumTables() {
		return tables.length;
	}

	/**
	 * Get the specified table
	 * @param i
	 * @return
	 */
	public Table getTable(int i) {
		if (i > 0 && i < tables.length) {
			return tables[i-1];
		} else
			return null;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~UTILITY
	/**
	 * Create specified number of tables.
	 * 
	 * @param numTables
	 */
	private void createTables(int numTables) {
		tables = new Table[numTables];
		for (int i = 0; i < tables.length; i++) {
			tables[i] = new Table(i);
		}
	}

	/**
	 * Place an order and add to queue.
	 * 
	 * @param order
	 */
	public void placeOrder(Order order) {
		queue.add(order);
		// refresh views
	}

	/**
	 * The order has been fulfilled and removed from the order queue.
	 * 
	 * @param order
	 */
	public void orderFulfilled(Order order) {
		queue.remove(order);
		// refresh views
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~UTILITY
}
