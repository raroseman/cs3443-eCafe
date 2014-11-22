package Model;

public class Account {
	private double cash;

	public Account() {
		cash = 0;
	}

	public Account(double cash) {
		this.cash = cash;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS

	public void orderPaid(double price) {
		this.cash += price;
	}

	public void buyIng(double cost) {
		this.cash -= cost;
	}

}
