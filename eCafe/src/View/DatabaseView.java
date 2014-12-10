package View;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Model.Ingredient;
import Model.MenuItem;
import Model.Restaurant;

/**
 * This class manages the Database GUI layout
 * 
 * @author All
 *
 */
public class DatabaseView extends JFrame {
	private JPanel panel;
	private JTextArea menuItems, ingredients;
	private JScrollPane menuScroll, ingScroll;
	private JLabel mLabel, iLabel;
	private Restaurant restaurant;
	
	/**
	 * Constructor
	 * @param restaurant
	 */
	public DatabaseView(Restaurant restaurant) {
		super("Database");
		this.restaurant = restaurant;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 480);
		setVisible(true);
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		mLabel = new JLabel();
		mLabel.setText("Menu Items");
		mLabel.setBounds(125, 10, 250, 25);
		panel.add(mLabel);

		menuItems = new JTextArea();
		menuItems.setEditable(false);
		menuScroll = new JScrollPane(menuItems);
		menuScroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		menuScroll.setBounds(25, 50, 250, 300);
		panel.add(menuScroll);
		for (MenuItem item : restaurant.getMenu().getItems()) {
			menuItems.append(item.toString() + "\n\n");
		}

		iLabel = new JLabel();
		iLabel.setText("Ingredients" + "");
		iLabel.setBounds(375, 10, 250, 25);
		panel.add(iLabel);

		ingredients = new JTextArea();
		ingredients.setEditable(false);
		ingScroll = new JScrollPane(ingredients);
		ingScroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		ingScroll.setBounds(300, 50, 250, 300);
		panel.add(ingScroll);
		for (Ingredient item : restaurant.getInventory().getIngredients()) {
			ingredients.append(item.toString() + "\n\n");
		}
	}
}
