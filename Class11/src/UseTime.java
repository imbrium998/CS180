import java.util.Scanner;



public class UseTime {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
	
		
		Time t = new Time(00, 00);
		boolean validTime = false;
			
		
		while(!validTime)
		{
			System.out.println("Please enter hour and minute values: ");
			int hour = kb.nextInt();
			int minute = kb.nextInt();
			
			validTime = t.setTime(hour, minute);
		}
		
		kb.close();

	}

	
}
