package Controller;
import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.text.DecimalFormat;

import javax.swing.DefaultListModel;

import Model.Menu;
import Model.MenuItem;

/**
 * MenuController controls most of the functionality for the menu view.
 * @author 
 *
 */
public class MenuController implements ActionListener{
	private MenuView menuView;
	private Menu menu;
	private double total = 0;
	private DefaultListModel listModel;
	private DefaultListModel orderModel;
	/**
	 * Constructor takes a menu and menuView as parameters.
	 * @param menu The menu associated with the restaurant.
	 * @param menuView The ui.
	 */
	public MenuController(Menu menu, MenuView menuView){
		this.menu = menu;
		this.menuView = menuView;
		listModel = new DefaultListModel();
		orderModel = new DefaultListModel();
	}
	
	/**
	 * actionPerformed method controls the buttons in the menu ui.
	 * @param ActionEvent e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat f = new DecimalFormat("0.##");
		String command = e.getActionCommand();
		ArrayList<MenuItem> result = new ArrayList<MenuItem>();
		ArrayList<MenuItem> order = new ArrayList<MenuItem>();
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
				map.put(item.getName() + "\t         $" + item.getPrice(), item);
			}
		}
		
	
		/**
		 * When the search button is pressed this action takes place.
		 */
		if (command.equals("go!")) {
			listModel.removeAllElements();
			for (MenuItem item : result) {
				
				listModel.addElement(item.getName() + "\t         $" + item.getPrice());
				}
			
			menuView.getRes().setModel(listModel);
			
		}
		
		
		/**
		 * When the add item button is pressed this action takes place.
		 */
		else if (command.equals("add to order")) {
			String str = menuView.getRes().getSelectedValue().toString();
			MenuItem item = map.get(str);
			order.add(item);

			if (!str.equals("")) {
				orderModel.addElement(item.getName() + "\t         $" + item.getPrice());
				menuView.getOrd().setModel(orderModel);
				total += item.getPrice();
				String tot = f.format(total);
				menuView.getTotalLabel().setText("Total: $" + tot);
				
			}
		}
		
		/**
		 * When the remove selected button is pressed this action takes place.
		 */
		else if (command.equals("remove selected")) {
			String str = menuView.getOrd().getSelectedValue().toString();
			MenuItem item = map.get(str);
			order.remove(item);
			
			if (!str.equals("")) {
				orderModel.removeElement(str);
				menuView.getOrd().setModel(orderModel);
				total -= item.getPrice();
				String tot = f.format(total);
				menuView.getTotalLabel().setText("Total: $" + tot);
			}
		}
		
		
	}
	
}
