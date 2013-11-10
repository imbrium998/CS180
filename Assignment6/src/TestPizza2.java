import java.util.Scanner;


public class TestPizza2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numToppings = 0;
		Pizza pizza1 = new Pizza();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the size of pizza (S, M or L): ");
		String s = kb.nextLine();
		char cs = s.charAt(0);
		
		System.out.print("How many toppings would you like to add to the pizza? ");
		numToppings = kb.nextInt();
		
		
		for (int i = 0; i <= numToppings; i++)
		{
						System.out.println("Please enter topping number " + (i + 1));
						String tops = kb.nextLine();
					
						pizza1.setToppings(add(tops));
						
						
		}
		
		
		System.out.println(pizza1.setSize(cs));
		
		
		
		
		
		kb.close();

	}

}
