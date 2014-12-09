package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.MenuItem;
import Model.Order;
import Model.Restaurant;
import View.KitchenView;

public class KitchenController implements ActionListener {
	private KitchenView view;
	private Restaurant restaurant;
	private ArrayList<Order> orderQueue = new ArrayList<Order>();
	private ArrayList<MenuItem> itemsQueue = new ArrayList<MenuItem>();

	public KitchenController(KitchenView view, Restaurant restaurant) {
		this.view = view;
		this.restaurant = restaurant;
		orderQueue = restaurant.getQueue();
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("Serve")) {
			if (!orderQueue.isEmpty()) {
				view.populateReadyField(orderQueue.get(0).toString());
				orderQueue.get(0).clearOrder();
				orderQueue.remove(0);
				restaurant.setQueue(orderQueue);
				view.clearProcessingArea();
			}
		}
	}

	public void getOrder() {
		orderQueue = restaurant.getQueue();
		displayOrders();
	}

	public String toString() {
		return restaurant.getName();
	}

	void displayOrders() {
		for (Order o : orderQueue) {
			view.populateProcessingField(o.toString());
		}
	}
}
