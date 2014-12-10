package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import Model.MenuItem;
import Model.Order;
import Model.Restaurant;
import View.KitchenView;

public class KitchenController implements ActionListener {
	private KitchenView view;
	private Restaurant restaurant;
	private ArrayList<Order> orderQueue = new ArrayList<Order>();
	private ArrayList<MenuItem> itemsQueue = new ArrayList<MenuItem>();
	private Calendar cal = Calendar.getInstance();
	private int receiveNumber = 1;
	private int serveNumber = 1;

	/**
	 * Constructor
	 * @param view
	 * @param restaurant
	 */
	public KitchenController(KitchenView view, Restaurant restaurant) {
		this.view = view;
		this.restaurant = restaurant;
		orderQueue = restaurant.getQueue();
	}

	/**
	 * Serves first order in
	 */
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("Serve")) {
			if (!orderQueue.isEmpty()) {
				displayReadyOrders();
			}
		}
	}
	
	/**
	 * Pulls orders from restaurant class
	 */
	public void getOrder() {
		orderQueue = restaurant.getQueue();
	}

	public String toString() {
		return restaurant.getName();
	}

	void displayProcessOrders() {
		view.clearProcessingArea();
		if (!orderQueue.isEmpty()) {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			receiveNumber = serveNumber;
			for (Order o : orderQueue) {
				itemsQueue = o.getItems();
				view.populateProcessField("Order #" + (receiveNumber++)
						+ "     Time in: " + sdf.format(cal.getTime())
						+ "      Table: 1\n");
				view.populateProcessField("---------------------------------------------------------------------------------------------------\n");
				for (MenuItem i : itemsQueue) {
					view.populateProcessField(i.getName() + "\n");
				}
				view.populateProcessField("\n");
			}
		}
	}

	void displayReadyOrders() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		view.populateReadyField("Order #" + (serveNumber++)
				+ " Complete!     Time out: " + sdf.format(cal.getTime())
				+ "      Table: 1");
		view.populateReadyField("---------------------------------------------------------------------------------------------------");
		view.populateReadyField("\n");
		orderQueue.get(0).setComplete(true);
		orderQueue.remove(0);
		displayProcessOrders();
	}
}
