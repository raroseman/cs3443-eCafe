package View;

import javax.swing.*;

/**
 * ViewFormatter puts the windows in appropriate locations and sets there default close operations.
 * 
 *
 */
public class ViewFormatter {
	private MenuView menu;
	private KitchenView kitchen;
	private DatabaseView db;
	
	/**
	 * Constructor takes a MenuView, KitchenView and DatabaseView as args
	 * @param menu The menu ui.
	 * @param kitchen The kitchen ui.
	 * @param db The db ui.
	 */
	public ViewFormatter(MenuView menu, KitchenView kitchen, DatabaseView db) {
		this.menu = menu;
		menu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		menu.setVisible(true);
		menu.setLocationRelativeTo(null);
		
		
		
		
		this.db = db;
		db.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		db.setVisible(true);
		db.setLocation(0, 0);
		
		
		this.kitchen = kitchen;
		kitchen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kitchen.setVisible(true);
		kitchen.setLocation(0, 300);
		
		/**
		 * Set the menu to the front.
		 */
		menu.toFront();
	}
	
	
	
	
	
	

}
