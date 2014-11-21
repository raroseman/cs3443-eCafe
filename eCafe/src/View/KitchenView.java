package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class KitchenView extends JFrame{
	private JPanel kitchenFrame;
	
	
	/**
	 * Create the frame.
	 */
	public KitchenView() {
		/**
		 * Building the kitchenFrame to hold the components of processinghPanel and readyPanel.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 650);
		kitchenFrame = new JPanel();
		kitchenFrame.setBackground(Color.LIGHT_GRAY);
		kitchenFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(kitchenFrame);
		kitchenFrame.setLayout(null);
		
		/**
		 * processingPanel holds the information for orders currently processing.
		 */
		JPanel processingPanel = new JPanel();
		processingPanel.setBackground(Color.LIGHT_GRAY);
		processingPanel.setBounds(24, 84, 473, 242);
		kitchenFrame.add(processingPanel);
		processingPanel.setLayout(null);
		
		/**
		 * Label to indicate the processing area.
		 */
		JLabel lblProcessing = new JLabel("Processing");
		lblProcessing.setBounds(32, 11, 73, 14);
		processingPanel.add(lblProcessing);
		
		/**
		 * Orders processing should appear here.
		 */
		JTextArea processingArea = new JTextArea();
		processingArea.setEditable(false);
		processingArea.setBounds(32, 36, 392, 191);
		processingPanel.add(processingArea);
		
		/**
		 * readyPanel holds the information for orders that are ready.
		 */
		JPanel readyPanel = new JPanel();
		readyPanel.setBackground(Color.LIGHT_GRAY);
		readyPanel.setBounds(24, 340, 473, 248);
		kitchenFrame.add(readyPanel);
		readyPanel.setLayout(null);
		
		/**
		 * Label to indicate the ready area.
		 */
		JLabel lblReady = new JLabel("Ready");
		lblReady.setBounds(37, 11, 46, 14);
		readyPanel.add(lblReady);
		
		/**
		 * Ready orders should appear here.
		 */
		JTextArea readyArea = new JTextArea();
		readyArea.setEditable(false);
		readyArea.setBounds(37, 42, 388, 194);
		readyPanel.add(readyArea);
		
		/**
		 * Panel that holds the title of the frame.
		 */
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.LIGHT_GRAY);
		titlePanel.setBounds(24, 11, 473, 70);
		kitchenFrame.add(titlePanel);
		titlePanel.setLayout(null);
		
		/**
		 * The label that indicates this is the Kitchen panel.
		 */
		JLabel lblKitchen = new JLabel("Kitchen");
		lblKitchen.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblKitchen.setBounds(191, 23, 82, 21);
		titlePanel.add(lblKitchen);
	}

}
