import javax.swing.JFrame;


import View.*;
import Controller.DatabaseController;


public class TestMain {

	public static void main(String[] args) {
		DatabaseController db = new DatabaseController("localhost", "unity", "root", "");
		
		db.attemptConnection();
		
		db.selectFrom("*", "Machines");
		
		MenuView menuView = new MenuView();
		menuView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuView.setVisible(true);
		
		KitchenView kitchenView = new KitchenView();
		kitchenView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kitchenView.setVisible(true);
		
	}

}
