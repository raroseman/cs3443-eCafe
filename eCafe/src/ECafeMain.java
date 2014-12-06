import java.sql.SQLException;

import javax.swing.JFrame;

import Controller.DatabaseController;
import Model.Restaurant;
import View.KitchenView;
import View.MenuView;

public class ECafeMain {
	private static DatabaseController db;
	private static MenuView menuView;
	private static KitchenView kitchenView;
	private static Restaurant restaurant;

	public static void main(String[] args) throws SQLException {
		restaurant = new Restaurant("eCafe - Coffee, Tea, American Fare", 1);
		
		db = new DatabaseController("localhost", "ECafe", "root", "", restaurant.getMenu(), restaurant.getInventory());
		
		while(!db.attemptConnection());
		
		db.pullMenu();
		
		db.pullInventory();

		for (int i = 0; i < restaurant.getNumTables(); i++) {
			menuView = new MenuView((i+1), restaurant);
			menuView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			menuView.setVisible(true);
		}

		kitchenView = new KitchenView();
		kitchenView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kitchenView.setVisible(true);

	}

}
