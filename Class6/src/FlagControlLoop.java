
import java.util.Scanner;


public class FlagControlLoop {

	public static void main(String[] args) {
		
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		int prevNum = kb.nextInt();
		int currNum;
		boolean nomatch = false;
		
		while (nomatch)
		{
			System.out.println("Please enter next number");
			currNum = kb.nextInt();
			
			if (currNum == prevNum)
				nomatch = false;
				prevNum = currNum;
		}
		kb.close();
		
	}
	
}
