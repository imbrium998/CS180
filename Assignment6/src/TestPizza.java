import java.util.Scanner;



public class TestPizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int numToppings = 3;
		String[] topping = new String[numToppings];
			
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the size of pizza (S, M or L): ");
		String size  =  kb.nextLine();
		System.out.println(size);
		
		System.out.print("How many toppings would you like to add to the pizza? ");
		numToppings = kb.nextInt();
		
		
		for (int i = 0; i <= numToppings; i++)
		{
						System.out.println("Please enter topping number " + (i + 1));
						topping[i] = kb.nextLine();
						
		}
		
		
		

	}

}
