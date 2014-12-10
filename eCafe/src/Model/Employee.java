package Model;


import java.util.ArrayList;
import java.util.Random;

public class Employee {
	private String name;
	private String tableSection;
	private int jobTitleCode;
	private int shiftID;
	private int SSN;
	private double sales;
	private ArrayList<Table> tables;
	
	/**
	 * Employee Constructor
	 * @param name
	 * @param tableSection
	 */
	public Employee(String name, String tableSection) {
		this.name = name;
		this.tableSection = tableSection;
		tables = new ArrayList<Table>();
	}
	
	/**
	 * Gets employee's total sales for the shift
	 * @param orderTotal
	 * @return sales;
	 */
	double getSales(double orderTotal) {
		sales += orderTotal;
		return sales;
	}
	
	/**
	 * Generates a random unique ID for the employee's shift
	 * @return shiftID
	 */
	int getShiftID() {
		Random rand = new Random();
		shiftID = rand.nextInt(9999 - 0 + 1) + 0;
		return shiftID;
	}
	
	/**
	 * Gets employee's Social Security Number
	 * @return SSN
	 */
	int getSSN() {
		return SSN;
	}
	
	/**
	 * Takes employee's job title as a String and returns its associated code
	 * @param jobTitle
	 * @return jobTitleCode
	 */
	int getJobTitleCode(String jobTitle) {
		switch(jobTitle) {
			case "host":
				jobTitleCode = 1;
				break;
			case "busser":
				jobTitleCode = 2;
				break;
			case "server":
				jobTitleCode = 3;
				break;
			case "bartender":
				jobTitleCode = 4;
				break;
			case "barback":
				jobTitleCode = 5;
				break;
			case "kitchen":
				jobTitleCode = 6;
				break;
			case "manager":
				jobTitleCode = 7;
				break;
			default:
				jobTitleCode = 0;
				break;
		}
		return jobTitleCode;
	}
}