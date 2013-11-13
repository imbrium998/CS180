
public class Pizza 
{
	private char size;
	private int status;
	private String[] toppings;
		
	// Create get methods for class private variables (Accessor methods)
		public char getSize() {
			return this.size;
		}
	
		public int getStatus() {
			return this.status;
		}
		
		public String[] getToppings() {
			return this.toppings;
		}
	
		
		
	// Create methods used 
		public boolean setSize(char size)
		{
			boolean isValid = false;
			if ((size == 'S') || (size == 'M') || (size == 'L')) 	{ isValid = true; } 
			else {isValid = false;}
		
			return isValid;
		}
		
		
		public boolean setStatus(int status)
		{
			boolean isValid = false;
			if ((status == 0) || (status == 1) || (status == 2))	{ isValid = true; }
			else {isValid = false;}
			return isValid;
		}
		
		
		public void setToppings(String [] toppings)
		{
		
			this.toppings = toppings;
			
		}
		
		public int numToppings()
		{
			int tNull = 0; 
			if ( toppings != null) 
					{tNull = 1; }
			else tNull = 0;
			return tNull;
		}
		
		
		public double calcPrice(int numToppings, char size)
		{
			double pizzaPrice = 0.0;
			
			switch (size)
				{case 'S': 
					pizzaPrice = 8.00;
					pizzaPrice = pizzaPrice + (numToppings * 1.00);
					break;
					
				case  'M':
					pizzaPrice = 9.00;
					pizzaPrice = pizzaPrice + (numToppings * 1.50);
					break;
					
				case  'L':
					pizzaPrice = 10.00;
					pizzaPrice = pizzaPrice + (numToppings * 2.00);
					break;
					
				default:
					pizzaPrice = 0.00;
					break;}
			
				return pizzaPrice;

		}


		
}