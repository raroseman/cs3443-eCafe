package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import Model.Inventory;
import Model.Menu;

/**
 * Executes database queries
 * 
 * @author All Test
 *
 */
public class DatabaseController implements ActionListener{
	private String host;
	private String database;
	private String username;
	private String password;
	private Connection connection;
	private Menu menu;
	private Inventory inventory;

	public DatabaseController(String host, String database, String username,
			String password, Menu menu, Inventory inventory) {
		this.host = host;
		this.database = database;
		this.username = username;
		this.password = password;
		this.menu = menu;
		this.inventory = inventory;
	}

	public boolean attemptConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.err
					.println("Driver Registration Failure: " + e.getMessage());
			return false;
		}
		connection = DriverManager.getConnection("jdbc:mysql://" + host + "/"
				+ database + "?user=" + username + "&password=" + password);
		return true;
	}

	public boolean pullMenu() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery("SELECT * FROM MenuItems");

		while (set.next()) {
			String name = set.getString("Name");
			String descrip = set.getString("Descrip");
			float price = set.getFloat("Price");
			float prepTime = set.getFloat("Time");
			menu.addMenuItem(name, descrip, price, prepTime);
		}

		return true;
	}

	public boolean pullInventory() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery("SELECT * FROM Ingredients");

		while (set.next()) {
			String name = set.getString("Name");
			String descrip = set.getString("Descrip");
			float cost = set.getFloat("Cost");
			int amount = set.getInt("Amount");
			inventory.addIngredient(name, descrip, cost, amount);
		}
		set.close();
		return true;
	}

	public boolean updateInventory(String name, int amount) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet set = statement
				.executeQuery("UPDATE `Ingredients` SET `Amount`=" + amount
						+ " WHERE `Name`=" + name);
		set.close();
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent act) {
		//do nothing
		
	}

}
