
public class KylesTest {

	public static void main(String[] args) {
	
		
		
		Pizza pizza1 = new Pizza();
		System.out.println(pizza1.toString());
		
		
		String[] toppings = new String[] {"onion","pepperoni"};
		

		Pizza pizza2 = new Pizza('L', toppings );
		System.out.println(pizza2.toString());
		
		Pizza[] pizzas = new Pizza[] {pizza1, pizza2};
		PizzaOrder pizzaorder1 = new PizzaOrder("David",pizzas);
		
		
		System.out.println(pizzaorder1.toString());
	}

}
