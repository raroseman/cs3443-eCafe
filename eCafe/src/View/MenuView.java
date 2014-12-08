package View;

import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

import Model.Menu;
import Model.Restaurant;
import Controller.MenuController;
/**
 * 
 * @author All
 *
 */
public class MenuView extends JFrame{
	private Restaurant restaurant;
	private JPanel menuFrame;
	private JTextField textField;
	private JTextArea textArea;
	private JPanel searchPanel;
	private JPanel orderPanel;
	
	/**
	 * Create the frame.
	 */
	public MenuView(int num, Restaurant restaurant) {
		/**
		 * Building the menuFrame to hold the components of searchPanel and orderPanel.
		 */
		super("Table " + num);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 494);
		menuFrame = new JPanel();
		menuFrame.setBackground(Color.LIGHT_GRAY);
		menuFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(menuFrame);
		menuFrame.setLayout(null);
		
		/**
		 * searchPanel holds the search bar and results of the search.
		 */
		searchPanel = new JPanel();
		searchPanel.setBackground(Color.LIGHT_GRAY);
		searchPanel.setBounds(10, 67, 427, 309);
		menuFrame.add(searchPanel);
		searchPanel.setLayout(null);
		
		/**
		 * Where the results of the search should be populated.
		 */
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(58, 69, 298, 161);
		searchPanel.add(textArea);
		
		/**
		 * Where the customer enters the search query.
		 */
		textField = new JTextField();
		textField.setBounds(58, 35, 298, 20);
		searchPanel.add(textField);
		textField.setColumns(10);
		
		/**
		 * Label next to search bar.
		 */
		JLabel lblSearch = new JLabel("search");
		lblSearch.setBounds(10, 37, 42, 17);
		searchPanel.add(lblSearch);
		
		/**
		 * Button to execute the search query.
		 */
		JButton btnGo = new JButton("go!");
		btnGo.setBounds(364, 34, 60, 23);
		searchPanel.add(btnGo);
		
		/**
		 * Button to add item to order.
		 */
		JButton btnAddToOrder = new JButton("add to order");
		btnAddToOrder.setBounds(57, 242, 150, 23);
		searchPanel.add(btnAddToOrder);
		
		/**
		 * orderPanel will display the customers current order and total.
		 */
		orderPanel = new JPanel();
		orderPanel.setBackground(Color.LIGHT_GRAY);
		orderPanel.setBounds(447, 69, 324, 307);
		menuFrame.add(orderPanel);
		orderPanel.setLayout(null);
		
		/**
		 * Area to display the ordered items.
		 */
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(76, 33, 223, 198);
		orderPanel.add(textArea_1);
		
		/**
		 * This should be updated when items are place into order.
		 */
		JLabel lblTotal = new JLabel("Total: $0.00");
		lblTotal.setBounds(26, 242, 114, 25);
		orderPanel.add(lblTotal);
		
		/**
		 * Label indicating the order area.
		 */
		JLabel lblOrder = new JLabel("Order:");
		lblOrder.setBounds(26, 30, 40, 31);
		orderPanel.add(lblOrder);
		
		/**
		 * Button to place the order.
		 */
		JButton btnPlaceOrder = new JButton("Place Order!");
		btnPlaceOrder.setBounds(149, 242, 150, 23);
		orderPanel.add(btnPlaceOrder);
		
		/**
		 * Panel that holds the title label.
		 */
		JPanel titelPanel = new JPanel();
		titelPanel.setBackground(Color.LIGHT_GRAY);
		titelPanel.setBounds(110, 11, 560, 45);
		menuFrame.add(titelPanel);
		
		/**
		 * The title of the panel.  Should hold the restaurant name.
		 */
		this.restaurant = restaurant;
		JLabel lblRestaurant = new JLabel(restaurant.getName());
		lblRestaurant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titelPanel.add(lblRestaurant);
	}
	
	public JTextField getSearchField() {
		return textField;
	}
	
	public JTextArea getResultsField() {
		return textArea;
	}
	
	
	
	public void registerListener(MenuController controller) {
		
		Component[] components = searchPanel.getComponents();
		
		//components = orderPanel.getComponents();
		
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}
	}
}
