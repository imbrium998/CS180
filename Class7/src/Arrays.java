import java.util.Scanner;


public class Arrays {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		int numGrades;
		
		System.out.println("Please enter how many grades?");
		numGrades = kb.nextInt();
	
		int[] grades = new int [numGrades];
	
		for (int at=0; at < grades.length; at++)
				{
					System.out.println("Enter grades " + (at+1));
					grades[at] = kb.nextInt();
				}
		
		int average = grades[0];
		
		for (int at=1; at < grades.length; at++ )
			{
				average += grades[at];
			}
				average /= grades.length;
			
		for (int at=0; at<grades.length;at++)
			grades[at] = 30;
		
		/* Extending array values
		 * grades[5] = 50
		 * grades[6] = 55
		 * grades[7] = 50
		 */
		
	}
	
	
}
