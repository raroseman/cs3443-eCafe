package Model;

/**
 * Class to keep track of the cash coming in
 * versus cash out.
 * 
 * @author Michael Schappel, Laura Aquino, Keith Cruz,
 * 		   Ryan Roseman, 
 *
 */
public class Account {
	private double cash;

	/**
	 * Constructor to initialize the 
	 * account to 0
	 */
	public Account() {
		cash = 0;
	}

	/**
	 * Constructor to initialize account to
	 * cash
	 * @param cash
	 */
	public Account(double cash) {
		this.cash = cash;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	/**
	 * Gets the cash
	 * @return cash
	 */
	public double getCash() {
		return cash;
	}

	/**
	 * Sets the cash amount
	 * @param cash
	 */
	public void setCash(double cash) {
		this.cash = cash;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS

	/**
	 * Cash in
	 * @param price
	 */
	public void orderPaid(double price) {
		this.cash += price;
	}

	/**
	 * Cash out
	 * @param cost
	 */
	public void buyIng(double cost) {
		this.cash -= cost;
	}

}
