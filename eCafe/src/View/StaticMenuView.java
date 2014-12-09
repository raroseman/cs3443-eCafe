package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import Model.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class StaticMenuView extends JFrame {

	private JPanel contentPane;
	private Restaurant restaurant;
	private JTextArea textArea;
	
	public StaticMenuView(Restaurant restaurant) {
		this.restaurant = restaurant;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 25, 369, 502);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(10, 11, 349, 480);
		panel.add(textArea);
		populateMenu();
	}
	
	public void populateMenu() {
		for (Model.MenuItem item : restaurant.getMenu().getItems()) {
			textArea.append(item.getName() + "\t\t$" + item.getPrice() + "\n\n");
		}
	}
}