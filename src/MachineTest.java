/* Andrew Vaughn
 * Developed 4/7/18
 * Computer Science 2261
 * Project 3
 * 
 * Objective: Write a Java program that uses an abstract class to get and set the name, description, price and weight for different machines.
 */	

public class MachineTest {

		    public static void main(String[] args) {
		    	
		    	//Creating the array for the machine list. The machine list contains 10 machines
		        Machine[] machines = new Machine[10];
		        
		        //First machine
		        machines[0] = new Printer();
		        machines[0].setName("Printer A");
		        machines[0].setDescription("This is a laser printer");
		        machines[0].setPrice(199.0);		        
		        machines[0].setWeight(30.0);
		        
		        //Second machine
		        machines[1] = new Printer();
		        machines[1].setName("Printer B");
		        machines[1].setDescription("This is an inkjet printer");
		        machines[1].setPrice(40.0);
		        machines[1].setWeight(1.5);
		        
		        //... you get the idea 
		        machines[2] = new Printer();
		        machines[2].setName("Printer C");
		        machines[2].setDescription("This is a slow inkjet printer");
		        machines[2].setPrice(70.0);
		        machines[2].setWeight(6.0);
		        
		        machines[3] = new Printer();
		        machines[3].setName("Printer D");
		        machines[3].setDescription("This is a fast inkjet printer");
		        machines[3].setPrice(50.0);
		        machines[3].setWeight(7.0);

		        machines[4] = new Scanner();
		        machines[4].setName("Scanner A");
		        machines[4].setDescription("This is a black and white scanner");
		        machines[4].setPrice(70.0);
		        machines[4].setWeight(4.0);
		        
		        machines[5] = new Scanner();
		        machines[5].setName("Scanner B");
		        machines[5].setDescription("This is a color scanner");
		        machines[5].setPrice(80.0);
		        machines[5].setWeight(20.0);

		        machines[6] = new Scanner();
		        machines[6].setName("Scanner C");
		        machines[6].setDescription("This scanner is both color and black/white");
		        machines[6].setPrice(250.0);
		        machines[6].setWeight(20.0);

  				machines[7] = new SmartPhone();
		        machines[7].setName("Smartphone A");
		        machines[7].setDescription("This smartphone has Marshmellow operating system");
		        machines[7].setPrice(230.0);
		        machines[7].setWeight(0.4);

		        machines[8] = new SmartPhone();
		        machines[8].setName("Smartphone B");
		        machines[8].setDescription("This smartphone has KitKat operating system");
		        machines[8].setPrice(240.0);
		        machines[8].setWeight(0.3);
		        
		        machines[9] = new SmartPhone();
		        machines[9].setName("Smartphone C");
		        machines[9].setDescription("This smartphone has Jelly Bean operating system");
		        machines[9].setPrice(235.0);
		        machines[9].setWeight(0.45);


		        for(int i=0; i< machines.length; i++)
		        {
		        System.out.println("Machine: " + (i+1));
		        System.out.println("Name: " + machines[i].getName());
		        System.out.println("Description: " + machines[i].getDescription());
		        System.out.println("Price: " + machines[i].getPrice());
		        System.out.println("Weight: " + machines[i].getWeight());
		        System.out.println("\n");
		        
		        
		        }
		        }
		        
	}
		

