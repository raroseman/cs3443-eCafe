import java.sql.SQLException;

import javax.swing.JFrame;

import Controller.*;
import Model.*;
import View.*;

/**
 * This class contains the main, which runs our application
 * 
 * @author All
 *
 */
public class ECafeMain {
	private static DatabaseController db;
	private static MenuView menuView;
	private static KitchenView kitchenView;
	private static DatabaseView databaseView;
	private static Restaurant restaurant;
	private static MenuController menuController;
	private static KitchenController kitchenController;

	/**
	 * Create interfaces and necessary components
	 * 
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		restaurant = new Restaurant("eCafe - Coffee, Tea, American Fare", 1);

		db = new DatabaseController("localhost", "ECafe", "root", "",
				restaurant.getMenu(), restaurant.getInventory());

		try {
			db.attemptConnection();
			db.pullMenu();
			db.pullInventory();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("\n\nPlease set up database.\nExiting Application\n");
			return;
		}

		menuView = new MenuView(1, restaurant);
		

		kitchenView = new KitchenView();
		kitchenController = new KitchenController(kitchenView, restaurant);

		menuController = new MenuController(restaurant.getMenu(), menuView,
				kitchenController, restaurant);
		menuView.registerListener(menuController);

		kitchenView.register(kitchenController);
		

		databaseView = new DatabaseView(restaurant);
		
		ViewFormatter f = new ViewFormatter(menuView, kitchenView, databaseView);

	}

}
