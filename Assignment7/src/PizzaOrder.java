import java.text.DecimalFormat;




public class PizzaOrder 
{
	private String customer;
	private Pizza[] orderedPizzas;
	
	
	// get Methods for instance variables
		public String getCustomer() 
			{
				return this.customer;
			}
	
	
		public Pizza[] getOrderedPizzas()
			{
				return this.orderedPizzas;
			}
	
		
		public PizzaOrder(String customer,  Pizza[] orderedPizzas)
			{
				this.customer = customer;
				this.orderedPizzas = orderedPizzas;
			}
	
		
		
	
		// method to determine and sum pizza prizes from each order.
		public double totalPrice()
			{
				double totalPrice = 0;
				
				if (orderedPizzas != null){
					for (int i = 0; i < orderedPizzas.length; i++)
					{
						totalPrice += orderedPizzas[i].calcPrice();
					}
				}
				return totalPrice;
			}
	
		// Method to determine if each of the pizzas in the order are ready.
		public Boolean isReady()
			{
				Boolean isReady = true;
				for (int i = 0; i < this.orderedPizzas.length; i++)
				{
					if (orderedPizzas[i].getStatus() == Pizza.NOT_STARTED || orderedPizzas[i].getStatus() == Pizza.IN_PROGRESS) 
						{
							isReady = false;
							break;
						};
				}
				
				return isReady;
			}
		
		
		// toString Method to output the Text of the orders
		public String toString() {
			
			
			DecimalFormat df = new DecimalFormat("0.00");
			StringBuilder builder = new StringBuilder();
			builder.append("Order for customer " + this.getCustomer() + ":\n");
			 
			if ( this.orderedPizzas == null || this.orderedPizzas.length <= 0) {
				builder.append("No pizzas ordered.\n");
			} else {
				for (int i = 0; i < this.orderedPizzas.length; i++) {
					builder.append(orderedPizzas[i].pizzaSize(orderedPizzas[1].getSize()) + " pizza, " );
					builder.append(orderedPizzas[i].numToppings() + " toppings, ");
					builder.append("$" + df.format(orderedPizzas[i].calcPrice()) + " ");
					builder.append("-- " + orderedPizzas[i].statusPhrase() + "\n");
				};
				builder.append("Order total: $" + df.format(this.totalPrice()));
			}
		
			return builder.toString();
		}
		
		
}
