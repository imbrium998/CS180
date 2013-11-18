import java.text.DecimalFormat;
import java.util.Scanner;


public class TestPizza {

	/**
	 * @author: David Klink
	 * TestPizza is a program created for a pizza take-out shop to manage pizza creation.   
	 * The user is asked what size, number of toppings and what toppings they are, and the 
	 * 	program determines the parameters and cost for use in a POS application. 
	 * @created 11/11/2013
	 * 
	 */
	
	public static void main(String[] args) {
		
		int numToppings = 0;
		Pizza pizza1 = new Pizza();
		Scanner kb = new Scanner(System.in);
		
		// Ask user to define the size of the pizza to make.  Set pizza size
		System.out.print("Please enter the size of pizza (S, M or L): ");
		String size = kb.nextLine();
		char cs = size.charAt(0);
		pizza1.setSize(cs);
		
		
		// Ask user to define the number of toppings they would like to include on pizza.
		System.out.print("How many toppings would you like to add to the pizza? ");
		numToppings = kb.nextInt();
		pizza1.numToppings();
		
		String[] tops = new String[numToppings];
		
		// Loop construct to ask for each topping and commit to the topping to a string array.
		for (int i = 0; i < numToppings ; i++)
			{
				System.out.print("Please enter topping number " + (i + 1) + " ");
				tops[i] = kb.next();	
			}
		
		
		// Take output of loop and commit to method variable.
		pizza1.setToppings(tops);
		
		// Calculate price of pizza
		//pizza1.calcPrice();   // int numToppings, char size
		DecimalFormat df = new DecimalFormat("0.00");	
		double price = pizza1.calcPrice(); 
		
			
		// Loop to set output line of * characters.  For Console display only.		
		for (int i = 0; i < 50; i++) 
			{		
				System.out.print("*");
			}
		
		// Additional output to print condition of pizza including size, number of toppings, and a loop to print out what toppings were asked for.
		System.out.println();
		System.out.println("Created a pizza of size " + pizza1.getSize() + " and " + pizza1.numToppings() + " toppings:");
		
		// loop to display all of the toppings that were asked for (stored in the array)
		for (int i = 0; i < pizza1.numToppings(); i++)
		{
				String[] toppings = pizza1.getToppings();
				System.out.println((i + 1) + ".  " + toppings[i]);
		}
		
		// Print out the total cost of the pizza in $ based on variables.
		System.out.println("This pizza costs $" + df.format(price));
		

		// Print out pizza status.
		System.out.println("Pizza readiness status is " + pizza1.getStatus());
		
		
		// Print out final output line of * characters serving as the footer of the reciept
		for (int i = 0; i < 50; i++) 
		{		
				System.out.print("*");
		
		}
		
		kb.close();

	}

}
