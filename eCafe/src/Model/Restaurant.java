package Model;

import java.util.ArrayList;

public class Restaurant {
	private String name;

	private Menu menu;
	private Inventory inventory;
	private Account account;

	private ArrayList<Order> queue;
	private Table[] tables;

	public Restaurant(String name) {
		this.name = name;
		queue = new ArrayList<Order>();
	}

	public Restaurant(String name, int numTables) {
		this.name = name;
		createTables(numTables);
		queue = new ArrayList<Order>();
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ArrayList<Order> getQueue() {
		return queue;
	}

	public void setQueue(ArrayList<Order> queue) {
		this.queue = queue;
	}

	public Table[] getTables() {
		return tables;
	}

	public void setTables(Table[] tables) {
		this.tables = tables;
	}

	public int getNumTables() {
		return tables.length;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~UTILITY
	private void createTables(int numTables) {
		tables = new Table[numTables];
		for (int i = 0; i < tables.length; i++) {
			tables[i] = new Table(i);
		}
	}

	public void placeOrder(Order order) {
		queue.add(order);
		// refresh views
	}

	public void orderFulfilled(Order order) {
		queue.remove(order);
		// refresh views
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~UTILITY
}
