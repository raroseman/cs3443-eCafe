package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
	private int orderNumber = 1;

	public KitchenController(KitchenView view, Restaurant restaurant) {
		this.view = view;
		this.restaurant = restaurant;
		orderQueue = restaurant.getQueue();
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("Serve")) {
			if (!orderQueue.isEmpty()) {
				//view.populateReadyField(orderQueue.get(0).toString());
				//orderQueue.get(0).clearOrder();
				//orderQueue.remove(0);
				//restaurant.setQueue(orderQueue);
				//view.clearProcessingArea();
				
				int i;
		        
		        for (i = 10; i < 0; i--) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if (i == 0) {
		        			System.out.println("DONE\n");
		        
						}
		        }
			}
		}
	}

	public void getOrder() {
		orderQueue = restaurant.getQueue();
	}

	public String toString() {
		return restaurant.getName();
	}

	void displayProcessOrders() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		view.populateProcessingField("Order #" + orderNumber + "     Time in: " + sdf.format(cal.getTime()) + "      Table: " + restaurant.getName());
		view.populateProcessingField("---------------------------------------------------------------------------------------------------");
		orderNumber++;
		for (Order o : orderQueue) {
				itemsQueue = o.getItems();
			for (MenuItem i : itemsQueue) {
				view.populateProcessingField(i.getName());
			}
			o.getItems().clear();
		}
		view.populateProcessingField("\n");	
	}
	
	void displayReadyOrders() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		view.populateProcessingField("Order #" + orderNumber + "     Time in: " + sdf.format(cal.getTime()) + "      Table: " + restaurant.getName());
		view.populateProcessingField("---------------------------------------------------------------------------------------------------");
		orderNumber++;
		for (Order o : orderQueue) {
				itemsQueue = o.getItems();
			for (MenuItem i : itemsQueue) {
				view.populateProcessingField(i.getName());
			}
			o.getItems().clear();
		}
		view.populateProcessingField("\n");	
	}
}
