package Controller;
import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.text.DecimalFormat;
import Model.Menu;
import Model.MenuItem;

public class MenuController implements ActionListener{
	private MenuView menuView;
	private Menu menu;
	private double total = 0;
	
	/**
	 * Constructor
	 * @param menu
	 */
	public MenuController(Menu menu, MenuView menuView){
		this.menu = menu;
		this.menuView = menuView;
	}

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
		
		if (command.equals("go!")) {
			
			menuView.getResultsField().setText(result.getName() + "\t         $" + result.getPrice() + "\t      prep:" +
					result.getPrepTime() + " minutes" );
		}
		
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
