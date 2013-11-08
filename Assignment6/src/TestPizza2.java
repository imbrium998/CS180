import java.util.Scanner;


public class TestPizza2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the size of pizza (S, M or L): ");
		String s = kb.nextLine();
		char cs = s.charAt(0);
		
		
	
		System.out.println(pizza1.setSize(cs));
		
	
		
		kb.close();

	}

}
