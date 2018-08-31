//parent class for printer scanner and smart phone
public abstract class Machine {

	//variables for each machine
	private String name;
	protected double price;
	protected double weight;
	private String description;
	
	//gets and sets are used for the variables
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public double getPrice () {
		return price;
	}
	
	public abstract void setPrice(double price);

	public double getWeight () {
		return weight;
	}
	public abstract void setWeight (double weight);
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;		
	}
	
}