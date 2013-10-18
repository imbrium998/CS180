import java.util.Scanner;

public class Handout5d {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int aNum = 0;
		
		do 
		{
			System.out.println("Enter a number: ");
			aNum = kb.nextInt();
		}
		
		while ((aNum%2) != 0);
		
		System.out.println("is even: ");

		kb.close();
	}

}
