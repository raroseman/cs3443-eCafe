package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import View.KitchenView;

public class KitchenController implements ActionListener {
		private KitchenView view;
		private PriorityQueue kitchenQueue = new PriorityQueue();
		
		public KitchenController(KitchenView view) {
			this.view = view;
		}
		
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command == "Serve")
				//view.populateReadyField("meow");
		}
}


