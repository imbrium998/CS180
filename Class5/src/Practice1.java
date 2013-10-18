import java.util.Scanner;


public class Practice1 {

	public static void main(String[] args) {
	
		int at = 0;
		int sum = 0;
		int prod = 1;
		Scanner keyboard = new Scanner(System.in);
		
		while (at < 10)
		{
			int fromUser = keyboard.nextInt();
			
			sum += fromUser;
			prod *= fromUser; //prod = prod * fromUser
			
			System.out.println( "FromUser " + fromUser);
			
			at++;
			
		}
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + sum/10);
		System.out.println("prod = " + prod);
		
	}

}
