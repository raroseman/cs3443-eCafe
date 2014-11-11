package Model;

public class MenuItem {
	private String name;
	private String description;
	private float price;
	private float prepTime;
	
	public MenuItem(String name, String description, float price, float prepTime){
		this.name = name;
		this.description = description;
		this.price = price;
		this.prepTime = prepTime;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(float prepTime) {
		this.prepTime = prepTime;
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GETTERS/SETTERS
}
