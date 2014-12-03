package Model;

//import java.util.ArrayList;

public class Table {

	private int ID;

	private boolean available;

	private Order order;

	public Table(int ID) {
		this.ID = ID;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Get the table ID.
	 * @return ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Set the table ID.
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * Check if a table is available. 
	 * @return available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Set the table to available.
	 * @param available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * Get the table order.
	 * @return order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Set the table order.
	 * @param order
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS	
}
