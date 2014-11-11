package Model;

import java.util.ArrayList;

public class MenuSpecial {
	private MenuItem[] items;
	private float price;
	
	public MenuSpecial(MenuItem[] items, float price){
		this.items = items;
		this.price = price;
	}

	public MenuItem[] getItems() {
		return items;
	}

	public void setItems(MenuItem[] items) {
		this.items = items;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
