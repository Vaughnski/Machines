//child class for smart phone 
public class SmartPhone extends Machine {
	
	//default price and weight for smart phone
	private static final double priceDefault = 200;
	private static final double weightDefault = 0.3;
	
	
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		if (price >=220 && price <=350)
		{
			this.price=price;
		}
		
		else
			this.price=priceDefault;	
	}
		
	
	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		if (weight > 0.2 && price < 300)
		{
			this.weight=weight;
		}
		
		else
			this.weight=weightDefault;	
	}	
	}
	
	 
	

