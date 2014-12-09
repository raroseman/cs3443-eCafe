package Model;

import java.util.ArrayList;

public class Order {
	private Table source;
	private boolean complete;
	private float time;
	private ArrayList<MenuItem> items;

	public Order(Table source) {
		this.source = source;
		items = new ArrayList<MenuItem>();
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * 
	 * @return source
	 */
	public Table getSource() {
		return source;
	}

	/**
	 * 
	 * @param source
	 */
	public void setSource(Table source) {
		this.source = source;
	}

	/**
	 * Check if order is complete.
	 * 
	 * @return complete
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * Set the order to complete.
	 * 
	 * @param complete
	 */
	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	/**
	 * Get the time for the order.
	 * 
	 * @return time
	 */
	public float getTime() {
		return time;
	}

	/**
	 * Set the time for the order.
	 * 
	 * @param time
	 */
	public void setTime(float time) {
		this.time = time;
	}

	/**
	 * Get the order items.
	 * 
	 * @return
	 */
	public ArrayList<MenuItem> getItems() {
		return items;
	}

	/**
	 * Set the items for the order.
	 * 
	 * @param items
	 */
	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS

	public void addItem(MenuItem item) {
		items.add(item);
	}

	public void removeItem(MenuItem item) {
		items.remove(item);
	}
}
