
import java.util.Scanner;

public class ChangeAndTime {
		
	public static void main(String[] args) {

		// Parameters for ticket price
		float ticketAmt = 0;  
		float tenderAmt = 0;
		float changeAmt = 0;
		
		float changeDollars = 0;
		float remain1 = 0;				// remainder after taking dollars out
		float changeQuarters = 0;
		double remain2 = 0;				// remainder after taking quarters out
		float changeDimes = 0;
		double remain3 = 0;				// remainder after taking dimes out
		float changeNickels = 0;
		double remain4 = 0;				// remainder after taking nickels out
		float changePennies = 0;
		
		// Parameters for time to movie
		int startHour = 0;
		int startMin = 0;
		
		int nowHour = 0;
		int nowMin = 0;
		
		int movieTime = 0;
		int nowTime = 0;
		
		int diffTime = 0;
		int diffHour = 0;
		int diffMin = 0;
		
		
// Part One: Determine how much change is due 
		
	// Introduce Program and ask how much ticket costs
	System.out.println("This program computes the change due to a person, and the time left before the start of a movie");	
	System.out.println("Please enter the price of the ticket (in dollars): ");
	
	// Allow console to gather ticket amount input and set variable to input value
	Scanner tixAmt = new Scanner (System.in);
	ticketAmt = tixAmt.nextFloat();
	
	// Ask how much was given to pay for ticket
	System.out.println("Please enter the amount received for the ticket (in dollars): ");
	
	// Allow console to gather tender and set variable to input value
	Scanner tendPrice = new Scanner (System.in);
	tenderAmt = tendPrice.nextFloat();
	
	// Set complete change amount prior to defining denomination
	changeAmt = tenderAmt - ticketAmt;
	
	changeDollars = (int) changeAmt / 1;				// Find how many dollars in change
	remain1 = ((changeAmt - changeDollars) % 1);		// Factor remainder
	
	changeQuarters = (int) (remain1 / .25);				// Find how many quarters in change
	remain2 = (remain1 % (changeQuarters * .25));

	changeDimes = (int) (remain2/.10);					// Find how many dimes in change
	remain3 = (remain2 - (changeDimes * .10));
	
	changeNickels = (int) (remain3/.05);				// Find how many nickels in change
	remain4 = (remain3 - (changeNickels * .05));
	
	changePennies = (int) (remain4/.01);				// Find how many pennies
	
	
	// Output amount of change and in what denomination
	System.out.printf("The amount due to the purchaser is " + "%4.2f", changeAmt);
	System.out.println();
	System.out.printf("The change can be given as " + (int) changeDollars + " dollars, " + (int)changeQuarters + " quarters, " + (int)changeDimes + " dimes, " + (int) changeNickels + " nickels, " + (int) changePennies + " pennies.");
	System.out.println();
	System.out.println();

	
	
// Part 2: Determing Time until movie
	
	// Start time component gathering.  Ask for start time
	System.out.println("When does this movie start (please indicate hours and minutes)? Hours: ");	
	Scanner movieHour = new Scanner(System.in);
	startHour = movieHour.nextInt();
	System.out.println("Minutes: ");
	Scanner movieMin = new Scanner(System.in);
	startMin = movieMin.nextInt();
	
	// Ask for current time
	System.out.println("What time is it now (please indicate hours and minutes)? Hours: ");
	Scanner timeHour = new Scanner(System.in);
	nowHour = timeHour.nextInt();
	System.out.println("Minutes: ");
	Scanner timeMin = new Scanner(System.in);
	nowMin = timeMin.nextInt();
	
	// Determine time between now and when movie starts
	movieTime = (startHour * 60) + startMin;
	nowTime = (nowHour * 60) + nowMin;

	diffTime = nowTime - movieTime;
	
	diffHour = Math.abs(diffTime/60);
	diffMin =  Math.abs(diffTime % 60);
	
	// Print output for time diff
	System.out.println("You have " + diffHour + " hours and " + diffMin + " minutes before the start of the movie.");
	
	}

}
