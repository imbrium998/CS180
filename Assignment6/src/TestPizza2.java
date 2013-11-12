import java.util.Scanner;
import java.util.Arrays;


public class TestPizza2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numToppings = 0;
		Pizza pizza1 = new Pizza();
		
		
			
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the size of pizza (S, M or L): ");
		String s = kb.nextLine();
		char cs = s.charAt(0);
		
		System.out.print("How many toppings would you like to add to the pizza? ");
		numToppings = kb.nextInt();
		String[] tops = new String[numToppings];
		
		for (int i = 0; i < numToppings ; i++)
			{
						System.out.print("Please enter topping number " + " " + (i + 1));
						tops[i] = kb.next();
								
			}
		
		
		for (int i = 0; i < 50; i++) 
		{		
				System.out.print("*");
		
		}
		
		
		System.out.println();
		System.out.println(Arrays.toString(tops));
		System.out.println(pizza1.setSize(cs));
		
		
		
		
		kb.close();

	}

}
