import java.util.Scanner;


public class Handout5b {

	public static void main(String[] args) {
		
		Scanner kbrd = new Scanner (System.in);
		int aNum;
	
		aNum = kbrd.nextInt();
	
			while ( aNum != 0)
		{
			System.out.print(aNum);
			aNum = kbrd.nextInt();
			
		}

			kbrd.close();
			
	}

}
