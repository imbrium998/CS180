
	/**
	 * 
	 * @author: David Klink
	 * Pizza class created to include methods to define function of creating pizza.  
	 * See TestPizza.java for more information 
	 * @created 11/11/2013
	 * 
	 */



public class Pizza 
{
	private char size;
	private int status;
	private String[] toppings;
	
	public final static int NOT_STARTED = 0;
	public final static int IN_PROGRESS = 1;
	public final static int READY = 2;
		
	
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
	
		
		public Pizza(char size, String[] toppings)
		{
			size = this.size;
			toppings = this.toppings;
		}
		
		public Pizza()
		{
			//this('M',null);
			size = 'M';
			toppings = null;
			status = NOT_STARTED;
		}
		
		

		public String statusPhrase()
		{
			String phrase = "";
			
			switch (status)
				{
					case NOT_STARTED: phrase = "Not started";
					break;
					case IN_PROGRESS: phrase = "In progress";
					break;
					case READY: phrase = "Ready";
					break;
				}
			
			return phrase;
		}
		
		public String toString()
		{
			return "Pizza size " + size + "  Toppings:";
		}
		
		
		
	// Create method to accept a pizza size */* set size to medium if the input is not valid parameter  
		public boolean setSize(char size)
		{
			boolean isValid = false;
			if ((size == 'S') || (size == 'M') || (size == 'L')) 	
					{ isValid = true; } 
			else 
					{size = 'M';
					isValid = false;}
			
			this.size = size;
		
			return isValid;
		}
		
	// 	Method to denote status of pizza (where in the creation process it is)	
		public boolean setStatus(int status)
		{
			boolean isValid = false;
			if ((status == NOT_STARTED) || (status == IN_PROGRESS) || (status == READY))	{ isValid = true; }
			else {isValid = false;}
			
			this.status = status;
			return isValid;
		}
		
	// Method to hold the pizza toppings in an array to be used to create order 	
		public void setToppings(String [] toppings)
		{
			this.toppings = toppings;
		}
		
	// Method to hold the number of toppings the user is asked	
		public int numToppings()
		{
			int t = 0; 
			if ( toppings != null) 
					{t = toppings.length;}
			else t = 0;
			
			return t;
		}
		
		// Method to calculate the price of the pizza.  Uses base size of pizza and number of toppings to determine price.
		public double calcPrice()
		{
			double pizzaPrice = 0.0;
			
			switch (size)
				{case 'S': 
					pizzaPrice = 8.00;
					pizzaPrice = pizzaPrice + (toppings.length * 1.00);
					break;
					
				case  'M':
					pizzaPrice = 9.00;
					pizzaPrice = pizzaPrice + (toppings.length * 1.50);
					break;
					
				case  'L':
					pizzaPrice = 10.00;
					pizzaPrice = pizzaPrice + (toppings.length * 2.00);
					break;
					
				default:
					pizzaPrice = 0.00;
					break;}
			
				return pizzaPrice;

		}
		
		
		
}