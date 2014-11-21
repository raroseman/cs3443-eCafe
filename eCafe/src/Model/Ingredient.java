package Model;

public class Ingredient {
	
	private float cost;
	
	private String name;
	
	public Ingredient(float cost, String name){
		this.cost = cost;
		this.name = name;
	}
	
	public float getCost(){
		return cost;
	}
	
	public void setCost(float cost){
		this.cost = cost;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}
