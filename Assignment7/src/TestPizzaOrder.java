


public class TestPizzaOrder {

	public static void main(String[] args) {
		
		Pizza[] pizzas = new Pizza[3];
		
		Pizza largePizza = new Pizza('L', new String[] {"anchovi","bacon"});
		Pizza smallPizza = new Pizza('S', new String[] {"onion","pepperoni","pepper","chicken"});
		Pizza mediumPizza = new Pizza('M', new String[] {});
		
		
		pizzas[0] = largePizza;
		pizzas[1] = smallPizza;
		pizzas[2] = mediumPizza;		
		
		PizzaOrder pizzaorder1 = new PizzaOrder("Peter Stone",pizzas);
		System.out.println(pizzaorder1.toString() + "\n");
		
		pizzaorder1.getOrderedPizzas()[0].setStatus(Pizza.IN_PROGRESS);
		pizzaorder1.getOrderedPizzas()[2].setStatus(Pizza.READY);
		System.out.println(pizzaorder1.toString() + "\n");
		
		System.out.println("Order ready is " + pizzaorder1.isReady() + "\n");
		
		pizzaorder1.getOrderedPizzas()[0].setStatus(Pizza.READY);
		pizzaorder1.getOrderedPizzas()[1].setStatus(Pizza.READY);
		System.out.println(pizzaorder1.toString() + "\n");
		System.out.println("Order ready is " + pizzaorder1.isReady() + "\n");
		
	}
		
	

}
