package Controller;

import View.MenuView;
import View.StaticMenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.text.DecimalFormat;

import javax.swing.DefaultListModel;

import Model.Menu;
import Model.MenuItem;
import Model.Order;
import Model.ProcessingTimer;
import Model.Restaurant;

/**
 * MenuController controls most of the functionality for the menu view.
 * 
 * @author
 *
 */
public class MenuController implements ActionListener {
	private MenuView menuView;
	private Menu menu;
	private double total = 0;
	private DefaultListModel listModel;
	private DefaultListModel orderModel;
	private Order order;
	private Restaurant restaurant;
	private KitchenController kitchenController;
	private ProcessingTimer orderTimer = new ProcessingTimer(10);

	/**
	 * Constructor takes a menu and menuView as parameters.
	 * 
	 * @param menu
	 *            The menu associated with the restaurant.
	 * @param menuView
	 *            The ui.
	 */
	public MenuController(Menu menu, MenuView menuView,
			KitchenController kitchenController, Restaurant restaurant) {
		this.menu = menu;
		this.menuView = menuView;
		this.kitchenController = kitchenController;
		listModel = new DefaultListModel();
		orderModel = new DefaultListModel();
		this.restaurant = restaurant;
		order = new Order(restaurant.getTable(menuView.getTable()));
	}

	/**
	 * getOrder gets the ordered items.
	 * 
	 * @return Order object
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * actionPerformed method controls the buttons in the menu ui.
	 * 
	 * @param ActionEvent
	 *            e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DecimalFormat f = new DecimalFormat("0.##");
			String command = e.getActionCommand();
			ArrayList<MenuItem> result = new ArrayList<MenuItem>();
			HashMap<String, MenuItem> map = new HashMap<String, MenuItem>();
			String s = menuView.getSearchField().getText().trim();
			if (!s.equals("")) {
				menuView.getSearchField().setText(s);
			}
			s.toLowerCase();

			for (MenuItem item : menu.getItems()) {
				String itemName = item.getName().toLowerCase();
				if (itemName.indexOf(s) >= 0) {
					result.add(item);
					map.put(item.getName() + "\t         $" + item.getPrice(),
							item);
				}
			}

			/**
			 * When the search button is pressed this action takes place.
			 */
			if (command.equals("go!")) {
				listModel.removeAllElements();
				for (MenuItem item : result) {

					listModel.addElement(item.getName() + "\t         $"
							+ item.getPrice());
				}

				menuView.getRes().setModel(listModel);

			}

			/**
			 * When the add item button is pressed this action takes place.
			 */
			else if (command.equalsIgnoreCase("add to order")) {
				if (!menuView.getRes().isSelectionEmpty()) {
					String str = menuView.getRes().getSelectedValue()
							.toString();
					MenuItem item = map.get(str);
					order.addItem(item);
					orderModel.addElement(item.getName() + "\t         $"
							+ item.getPrice());
					menuView.getOrd().setModel(orderModel);
					total += item.getPrice();
					String tot = f.format(total);
					menuView.getTotalLabel().setText("Total: $" + tot);
				}
			}

			/**
			 * When the remove selected button is pressed this action takes
			 * place.
			 */
			else if (command.equalsIgnoreCase("remove selected")) {
				if (!menuView.getOrd().isSelectionEmpty()) {
					String str = menuView.getOrd().getSelectedValue()
							.toString();
					MenuItem item = map.get(str);
					order.removeItem(item);

					orderModel.removeElement(str);
					menuView.getOrd().setModel(orderModel);
					total -= item.getPrice();
					String tot = f.format(total);
					menuView.getTotalLabel().setText("Total: $" + tot);

				}
			}

			/**
			 * Add order to the queue
			 */
			else if (command.equalsIgnoreCase("Place Order!")) {
				if (!order.getItems().isEmpty()) {
					restaurant.placeOrder(order);
					kitchenController.displayProcessOrders();
					orderModel.clear();
					menuView.getOrd().setModel(orderModel);
					total = 0;
					String tot = f.format(total);
					menuView.getTotalLabel().setText("Total: $" + tot);
					order = new Order(null);
				}
			}

			/**
			 * Shows the menu when view menu is pushed
			 */
			else if (command.equals("view menu")) {
				StaticMenuView menu = new StaticMenuView(restaurant);
				menu.setVisible(true);
			}
		} catch (NullPointerException x) {

		}
	}

}
