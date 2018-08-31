
//child class printer
public class Printer extends Machine {

	//default price and weight for printer
	private static final double priceDefault = 90.0;
	private static final double weightDefault= 25.0;
	
	//setting the price 
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		//when price is in between 0-50 the weight is used
		if (price >=40 && price <=200)
		{
			this.price=price;
		}
		//otherwise default price
		else
			this.price=priceDefault;	
	}

	//setting the weight 
	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		//when weight is in between 0-50 the weight is used
		if(weight > 0 && weight < 50)
		{
			this.weight = weight;
		}
		//otherwise the default weight is used
		else
			this.weight= weightDefault;
	}

}
