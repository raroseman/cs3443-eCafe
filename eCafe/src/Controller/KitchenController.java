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
				view.populateReadyField(restaurant.getName());
				
			}
		}

		public void getOrder() {
			orderQueue = restaurant.getQueue();
		}
		
		public String toString() {
			return restaurant.getName();
		}
		
		
		  public void displayOrders(){
			  for (Order o : orderQueue) {
				  itemsQueue = o.getItems();
				  for (MenuItem i : itemsQueue) {
					  view.populateProcessField(i.getName());
				  }
				  o.getItems().clear();	
			  }
		  }
		 
}
