package Controller;
import View.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.Menu;
import Model.MenuItem;

public class MenuController implements ActionListener{
	private MenuView menuView;
	private Menu menu;
	
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
		String command = e.getActionCommand();
		
		if (command.equals("go!")) {
			String s = menuView.getSearchField().getText().trim();
			if (!s.equals("")) {
				menuView.getSearchField().setText(s);
			}
			s.toLowerCase();
			MenuItem result = null;
			for (MenuItem item : menu.getItems()) {
				String itemName = item.getName().toLowerCase();
				if (itemName.indexOf(s) >= 0) {
					result = item;
				}
			}
			menuView.getResultsField().setText(result.getName() + "\t         $" + result.getPrice() + "\t      prep:" +
					result.getPrepTime() + " minutes" );
		}
		
		
		
	}
	
}
