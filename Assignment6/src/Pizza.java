
public class Pizza 
{
	private char size;
		
	
	public char getSize() {
		return this.size;
		
	}
	
	public boolean setSize(char size)
	{
		boolean isValid = false;
		if ((size == 'S') || (size == 'M') || (size == 'L'))  
			{ isValid = true;} 
		else {isValid = false;}
		return isValid;
	}
		
		
	
		
	
}