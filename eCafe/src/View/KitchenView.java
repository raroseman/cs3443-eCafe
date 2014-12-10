package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextArea;

import Controller.KitchenController;

/**
 * This class manages the Kitchen GUI layout
 * @author All
 *
 */
public class KitchenView extends JFrame {
	private JPanel kitchenFrame;
	private JButton btnServe;
	private JScrollPane processScroll, readyScroll;
	private JTextArea menuItems, readyItems;

	/**
	 * Create the frame.
	 */
	public KitchenView() {
		super("Kitchen");
		/**
		 * Building the kitchenFrame to hold the components of processinghPanel
		 * and readyPanel.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 650);
		kitchenFrame = new JPanel();
		kitchenFrame.setBackground(Color.LIGHT_GRAY);
		kitchenFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(kitchenFrame);
		kitchenFrame.setLayout(null);

		/**
		 * processingPanel holds the information for orders currently
		 * processing.
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
		 * Button to move from processing to ready
		 */
		btnServe = new JButton("Serve");
		btnServe.setBounds(368, 323, 80, 23);
		kitchenFrame.add(btnServe);

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

		/**
		 * Scroll panel and text area for processing panel
		 */
		menuItems = new JTextArea();
		menuItems.setEditable(false);
		processScroll = new JScrollPane(menuItems);
		processScroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		processScroll.setBounds(32, 36, 392, 191);
		processingPanel.add(processScroll);

		/**
		 * Scroll Panel and text area for ready panel
		 */
		readyItems = new JTextArea();
		menuItems.setEditable(false);
		readyScroll = new JScrollPane(readyItems);
		readyScroll
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		readyScroll.setBounds(37, 42, 388, 194);
		readyPanel.add(readyScroll);
	}

	/**
	 * Registers KitchenController to the serve button
	 * 
	 * @param controller
	 */
	public void register(KitchenController controller) {
		btnServe.addActionListener(controller);
	}

	/**
	 * Adds text to processing text area
	 * 
	 * @param text
	 */
	public void populateProcessField(String text) {
		menuItems.append(text);
	}

	/**
	 * Adds text to ready text area
	 * 
	 * @param text
	 */
	public void populateReadyField(String text) {
		readyItems.append(text + "\n");
	}

	/**
	 * Clears processing text area
	 */
	public void clearProcessingArea() {
		menuItems.setText("");
	}
}
