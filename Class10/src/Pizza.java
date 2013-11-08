


public class Pizza 
{
	private char size;
	//private String[] toppings;
	//private int status;

	private boolean setSize()
	{
		boolean r;
		char s;
		if (size == 'S')
			{
			s = 'S';
			r = true;
			}
		if (size == 'M')
			{
			s = 'M';
			r = true;
			}
		if (size == 'L')
			{
			r = true;
			}	
		else r = false;
		
		return r;
	}
	
		
}



/**

returnType functionName(parameterlist)
{
     body of method
}

**/