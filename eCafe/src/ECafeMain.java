import java.sql.SQLException;

import javax.swing.JFrame;

import Controller.*;
import Model.*;
import View.*;


public class ECafeMain {
	private static DatabaseController db;
	private static MenuView menuView;
	private static KitchenView kitchenView;
	private static Restaurant restaurant;
	private static MenuController controller;
	private static KitchenController kitchenController;

	public static void main(String[] args) throws SQLException {
		restaurant = new Restaurant("eCafe - Coffee, Tea, American Fare", 1);
		
		db = new DatabaseController("localhost", "ECafe", "root", "", restaurant.getMenu(), restaurant.getInventory());
		
		while(!db.attemptConnection());
		
		db.pullMenu();
		
		db.pullInventory();
		
		menuView = new MenuView(1, restaurant);
		menuView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		menuView.setVisible(true);
		
		controller = new MenuController(restaurant.getMenu(), menuView, restaurant);
		menuView.registerListener(controller);

		kitchenView = new KitchenView();
		kitchenController = new KitchenController(kitchenView, restaurant);
		
		//register added
		kitchenView.register(kitchenController);
		kitchenView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kitchenView.setVisible(true);

	}

}
