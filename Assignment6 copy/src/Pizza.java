
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
			String[] t = new String[numToppings];
			
		}
		
		public void numToppings()
		{
			
		}

		
		
}