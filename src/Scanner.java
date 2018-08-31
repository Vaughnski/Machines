//child class for the scanner
public class Scanner extends Machine {

	//default price and weight 
	private static final double priceDefault = 80.0;
	private static final double weightDefault= 10.0;
	
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		//same concept as the printer class
		if (price >=60 && price <=300)
		{
			this.price=price;
		}
		
		else
			this.price=priceDefault;	
	}
	

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		if (weight > 2 && weight < 25)
		{
			this.weight=weight;
		}
		
		else
			this.weight=weightDefault;	
	}
		
	}

	

