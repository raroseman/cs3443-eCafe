package Controller;
import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.text.DecimalFormat;
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
	
	/**
	 * Constructor takes a menu and menuView as parameters.
	 * @param menu The menu associated with the restaurant.
	 * @param menuView The ui.
	 */
	public MenuController(Menu menu, MenuView menuView){
		this.menu = menu;
		this.menuView = menuView;
	}
	
	/**
	 * actionPerformed method controls the buttons in the menu ui.
	 * @param ActionEvent e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat f = new DecimalFormat("0.##");
		String command = e.getActionCommand();
		MenuItem result = null;
		String s = menuView.getSearchField().getText().trim();
		if (!s.equals("")) {
			menuView.getSearchField().setText(s);
		}
		s.toLowerCase();
		
		for (MenuItem item : menu.getItems()) {
			String itemName = item.getName().toLowerCase();
			if (itemName.indexOf(s) >= 0) {
				result = item;
			}
		}
		
		/**
		 * When the search button is pressed this action takes place.
		 */
		if (command.equals("go!")) {
			
			menuView.getResultsField().setText(result.getName() + "\t         $" + result.getPrice() + "\t      prep:" +
					result.getPrepTime() + " minutes" );
		}
		
		/**
		 * When the add item button is pressed this action takes place
		 */
		else if (command.equals("add to order")) {
			String str = menuView.getResultsField().getText().trim();
			if (!str.equals("")) {
				menuView.getOrderField().append(result.getName() + "\t         $" + result.getPrice() +"\n");
				total += result.getPrice();
				String tot = f.format(total);
				menuView.getTotalLabel().setText("Total: $" + tot);
				
			}
			
		}
		
		
		
	}
	
}
