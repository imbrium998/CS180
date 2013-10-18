import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		int at = 0;
		int sum = 0;
		int prod = 1;
		int fromUser = 0;
		int smallest = 0;
		int largest = 0;
		
		System.out.println("How many numbers would you like?");
		Scanner keyboard = new Scanner(System.in);
		
		int howMany = keyboard.nextInt();
		
		while (at < howMany);
		{
			System.out.println("enter value");
			fromUser = keyboard.nextInt();
			if (fromUser > largest)
				largest = fromUser;
			if (fromUser < smallest)
				smallest = fromUser;
			System.out.println( "at " + at);	
			at++;
		}
		
		System.out.println("largest " + largest);
		System.out.println("smallest " + smallest);
	}

}
