

/**
 * @author davidklink
 * 
 * ParkingRates was written to calculate the amount due based on when a customer enters and exits
 * the parking garage.  Based on the rate type and time stamp entered, program will calculate appropriate 
 * charge for customer.
 * Rates are:  
 * (V)alidated rate = $5 for first 3 hours, $3 each half hour after
 * (R)egular rate = In between 6 and 8:30 *AND* Out between 15:0 and 18:00 is "earlybird" = $15
 * (R)egular rate = $2 entry fee + $3 per each half hour before 11 and $5 for each half hour after
 *
 */


import javax.swing.JOptionPane;
import java.text.DecimalFormat; 

public class ParkingRates {


	public static void main(String[] args) {
	
		
		//  cast variables needed to calculate
		final int RATE_CHANGE_TIME = 11*60;  //time when regular rate switches
						
		int hourIn = 0;
		int minuteIn = 0;
		int hourOut = 0;
		int minuteOut = 0;
		int totalMinutes = 0;
		int totalHours = 0;
		int totalTime = 0;
		int preElevenMin = 0;
		int postElevenMin = 0;
		String inTime = " ";
		String outTime = " ";
		String rateType = " ";
		String timeInOut = " ";
		int totalDue = 0;
		
		// set decimal format routine for final output of money due
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		// Show dialog to ask for rate type and time in/out used for calculation
		rateType = JOptionPane.showInputDialog("Please enter type of rate: ");
		
		timeInOut = JOptionPane.showInputDialog("Please enter time in and out in hh:mm form, separated by spaces: ");
		
		
		// Split the time input into 2 groups. 0 = in time and 1 = out time
		String[] timeparts = timeInOut.split(" ");
		inTime = timeparts[0];
		outTime = timeparts[1];
		
		// split in time into parts. 0 = hours and 1 = minutes
		String[] startparts = inTime.split(":");
		hourIn = Integer.parseInt(startparts[0]);
		minuteIn = Integer.parseInt(startparts[1]);
		
		// split out time into parts.  0 = hours and 1 = minutes
		String[] endparts = outTime.split(":");
		hourOut = Integer.parseInt(endparts[0]);
		minuteOut = Integer.parseInt(endparts[1]);
		
		// Convert all time to minutes for simplified math calculation
		totalHours = hourOut - hourIn;
		totalMinutes = minuteOut - minuteIn; 
		totalTime = (totalHours * 60) + (totalMinutes);
		
			
		// Determine pre/post 11 am minutes to bill at
		preElevenMin = RATE_CHANGE_TIME - ((hourIn * 60) + minuteIn);
		postElevenMin = ((hourOut * 60) + minuteOut) - RATE_CHANGE_TIME;
		
		
		// Start total due evaluation and output based on input and calc.
		switch (rateType.toUpperCase())  {
			case "V":														
					{
						if (totalTime <= 180) {totalDue = 5;} 
			
						else  totalDue = ((((totalTime) - 180) / 30) * 3) + 5;
						
						JOptionPane.showMessageDialog(null,"Charging VALIDATED rates.  Please pay $" + df.format(totalDue));
					}
					break;
					
					
			
			case "R":
					{
						if 		(
								((hourIn >= 6) && ((hourIn <=8) && (minuteOut <= 30)))
								&&
								((hourOut >= 15) && ((hourOut <= 17) && minuteOut < 59))
								)
								{totalDue = 15; 
								
								JOptionPane.showMessageDialog(null,"Charging EARLY BIRD rate.  Please pay $" + df.format(totalDue));}
						
						else if 		((hourIn < 11) && (hourOut <= 11)) 
								{totalDue = ((totalTime / 30) * 3) + 2;
								JOptionPane.showMessageDialog(null,"Charging REGULAR rates.  Please pay $" + df.format(totalDue));}
						
						else if 		((hourIn >= 11) && (hourOut > 11))
								{totalDue = ((totalTime / 30) * 5) + 2;
								JOptionPane.showMessageDialog(null,"Charging REGULAR rates.  Please pay $" + df.format(totalDue));}
						
						else 							
								{totalDue = ((preElevenMin / 30) * 5) + ((postElevenMin / 30) * 3) + 2;
								JOptionPane.showMessageDialog(null,"Charging REGULAR rates.  Please pay $" + df.format(totalDue));}					
					}
					break;
			
			
					default:
					        {JOptionPane.showMessageDialog(null,"Error:  Not allowable rate type");}
					        
					        
					        
		}
		
			
	}

}
