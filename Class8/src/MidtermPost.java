import java.util.Scanner;


public class MidtermPost {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		boolean done = false;
		
		while (!done)
		{
			String invalue = kb.next();
			
			if(invalue.toUpperCase().equals("exit"))
			{
				done = true; 
			}
		else
		{
			int first = Integer.parseInt(invalue);
			int second = kb.nextInt();
			int third = kb.nextInt();
			
			if ((first > second) && (second > third) ||
					(first < second) && (second < third))
			{
				System.out.println("Numbers are in order");
				done = true;
			}
			
			
		}
				
		}
		
	}

}
