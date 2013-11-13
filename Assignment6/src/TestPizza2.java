import java.util.Scanner;
import java.util.Arrays;
//import java.text.DecimalFormat;



public class TestPizza2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numToppings = 0;
		Pizza pizza1 = new Pizza();
				
		// Ask user to define the size of the pizza to make.  Set pizza1.size
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the size of pizza (S, M or L): ");
		String size = kb.nextLine();
		char cs = size.charAt(0);
		pizza1.setSize(cs);
		
		
		// Ask user to define the number of toppings they would like to include on pizza.
		System.out.print("How many toppings would you like to add to the pizza? ");
		numToppings = kb.nextInt();
		String[] tops = new String[numToppings];
		
		for (int i = 0; i < numToppings ; i++)
			{
						System.out.print("Please enter topping number " + (i + 1) + " ");
						tops[i] = kb.next();
						//System.out.println(Arrays.toString(tops));
								
			}
		
		
		
		pizza1.setToppings(tops);
		pizza1.calcPrice(pizza1.numToppings(),pizza1.getSize());   // int numToppings, char size
		
			
		System.out.println();
		System.out.println(Arrays.toString(pizza1.getToppings()));
		
		for (int i = 0; i < 50; i++) 
		{		
				System.out.print("*");
		
		}
		
		System.out.println();
		System.out.println("Created a pizza of size " + pizza1.getSize() + " and " + pizza1.numToppings() + " toppings:");
		
		for (int i = 0; i < pizza1.numToppings(); i++)
		{
				String[] toppings = pizza1.getToppings();
				System.out.println((i + 1) + ".  " + toppings[i]);
		}
		
		System.out.println("This pizza costs " + pizza1.calcPrice(pizza1.numToppings(), pizza1.getSize()));

		
		System.out.println("Pizza readiness status is " + pizza1.getStatus());
		
		for (int i = 0; i < 50; i++) 
		{		
				System.out.print("*");
		
		}
		
		kb.close();

	}

}
