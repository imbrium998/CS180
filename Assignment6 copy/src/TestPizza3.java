
public class TestPizza3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Pizza pizza1 = new Pizza();
		
		pizza1.setStatus(1);
		pizza1.setSize('M');
		pizza1.getToppings();
			
		System.out.println(pizza1.setStatus(0));
		System.out.println(pizza1.setStatus(1));
		System.out.println(pizza1.setStatus(2));
		System.out.println(pizza1.setStatus(3));
		
		System.out.println(pizza1.setSize('M'));
		System.out.println(pizza1.setSize('F'));
		
		String[] strArray = new String[] {"John", "Mary", "Bob"};
		//output: [John, Mary, Bob]	
		
		
		

	}

}
