import java.util.Scanner;

public class Handout5c {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int aNum = kb.nextInt();
	
		
		/*
		while ((aNum%2) != 0)
		{
			System.out.println("Enter a number: ");
			aNum = kb.nextInt();
		}
		*/
		
		while (!(aNum <= 9) && (aNum >= 0 ))
		{
			System.out.println("Enter a number: ");
			aNum = kb.nextInt();
		}
			
		kb.close();
		
	}

}
