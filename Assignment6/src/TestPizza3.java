import java.util.Arrays;


public class TestPizza3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Pizza pizza1 = new Pizza();
		
		String[] toppings = new String[5];
		toppings[0] = "moo";
		toppings[1] = "goo";
		toppings[2] = "gai";
		toppings[3] = "pan";
		
		System.out.println(Arrays.toString(toppings));
		
				
		pizza1.setToppings(toppings);
		
		System.out.println(Arrays.toString(pizza1.getToppings()));
			
			
		pizza1.setStatus(1);
		pizza1.setSize('f');
		pizza1.getToppings();
		
			
		pizza1.setSize('L');
		System.out.println(pizza1.getSize());
		
		
		
		
		System.out.println(pizza1.setStatus(0));
		System.out.println(pizza1.setStatus(1));
		System.out.println(pizza1.setStatus(2));
		System.out.println(pizza1.setStatus(3));
		System.out.println();
		System.out.println(pizza1.setSize('M'));
		System.out.println(pizza1.setSize('F'));
		System.out.println();
			
		System.out.println(pizza1.calcPrice(5,  'S'));
		System.out.println(pizza1.numToppings());
		
		if (pizza1.size = 0){
			
		}
		
		

	}

}
