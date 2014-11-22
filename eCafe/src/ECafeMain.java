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

	public static void main(String[] args) {
		db = new DatabaseController("localhost", "unity", "root", "");

		while (!db.attemptConnection())
			;

		restaurant = new Restaurant("Test", 3);

		for (int i = 0; i < restaurant.getNumTables(); i++) {
			menuView = new MenuView((i+1));
			menuView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menuView.setVisible(true);
		}

		kitchenView = new KitchenView();
		kitchenView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kitchenView.setVisible(true);

	}

}
