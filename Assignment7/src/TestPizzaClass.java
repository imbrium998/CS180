
public class TestPizzaClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Pizza p1 = new Pizza();
		
		//p1.getSize();
		
		p1.setSize('S');
		
		System.out.println(p1.getSize());
		System.out.println(p1.getToppings());
		System.out.println(p1.statusPhrase());
		
		System.out.println(p1.toString());
		
		
		
		

	}

}
