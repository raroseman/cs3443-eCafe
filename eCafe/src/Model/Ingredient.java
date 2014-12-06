package Model;

public class Ingredient {

	private String name;
	private String descrip;
	private float cost;
	private int amount;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param descrip
	 * @param cost
	 * @param amount
	 */
	public Ingredient(String name, String descrip, float cost, int amount) {
		this.name = name;
		this.descrip = descrip;
		this.cost = cost;
		this.amount = amount;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
}
