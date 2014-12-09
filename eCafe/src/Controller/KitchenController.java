package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import Model.Restaurant;
import View.KitchenView;

public class KitchenController implements ActionListener {
		private KitchenView view;
		private Restaurant restaurant;
		private PriorityQueue kitchenQueue = new PriorityQueue();
		
		public KitchenController(KitchenView view, Restaurant restaurant) {
			this.view = view;
			this.restaurant = restaurant;
		}
		
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equalsIgnoreCase("Serve")){
				view.populateReadyField("meow");
			}
		}
		
		/*
		 * public void displayOrders(){
		 * 		Display orders from Restaurant.getQueue()
		 * }
		 */
}
