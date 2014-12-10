package Model;

import java.util.ArrayList;

/**
 * Class to manage the orders. 
 * 
 * @author All
 *
 */
public class Order {
	private Table source;
	private boolean complete;
	private float time;
	private ArrayList<MenuItem> items;
	
    /**
     * Constructor
     * @param source
     */
	public Order(Table source) {
		this.source = source;
		items = new ArrayList<MenuItem>();
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Get the source
	 * @return source
	 */
	public Table getSource() {
		return source;
	}

	/**
	 * Set the source
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

	/**
	 * Add the menu item to the items ArrayList
	 * .
	 * @param item
	 */
	public void addItem(MenuItem item) {
		items.add(item);
	}

	/**
	 * Remove the menu item from the items ArrayList.
	 * @param item
	 */
	public void removeItem(MenuItem item) {
		items.remove(item);
	}
	
	/**
	 * Clears all items from order
	 */
	public void clearOrder(){
		items.clear();
	}
	
	public String toString(){
		String orderSummary = "Order:\n";
		for(int i = 0; i < items.size(); i++){
			orderSummary += items.get(i).toString() + "\n";
		}
		return orderSummary + "\n";
		
	}
}
