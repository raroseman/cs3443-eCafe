import java.sql.SQLException;

import javax.swing.JFrame;

import Controller.DatabaseController;
import Controller.*;
import Model.*;
import View.*;


public class ECafeMain {
	private static DatabaseController db;
	private static MenuView menuView;
	private static KitchenView kitchenView;
	private static Restaurant restaurant;
	private static MenuController controller;

	public static void main(String[] args) throws SQLException {
		restaurant = new Restaurant("eCafe - Coffee, Tea, American Fare", 1);
		
		db = new DatabaseController("localhost", "ECafe", "root", "", restaurant.getMenu(), restaurant.getInventory());
		
		while(!db.attemptConnection());
		
		db.pullMenu();
		
		db.pullInventory();
		
		System.out.println("Menu Items:\n");
		for (int i = 0; i < restaurant.getMenu().getItems().size(); i++) {
			System.out.println(restaurant.getMenu().getItems().get(i).toString() + "\n");
		}
		
		System.out.println("Ingredients:\n");
		for (int i = 0; i < restaurant.getInventory().getIngredients().size(); i++) {
			System.out.println(restaurant.getInventory().getIngredients().get(i).toString() + "\n");
		}
		
		menuView = new MenuView(1, restaurant);
		menuView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		menuView.setVisible(true);
		
		
		
		controller = new MenuController(restaurant.getMenu(), menuView);
		menuView.registerListener(controller);

		kitchenView = new KitchenView();
		kitchenView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kitchenView.setVisible(true);

	}

}
