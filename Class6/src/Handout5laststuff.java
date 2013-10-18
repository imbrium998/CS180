import java.util.Scanner;

public class Handout5laststuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a string: ");
		String inString = kb.nextLine();
		System.out.println("Input a character: ");
		String charString = kb.nextLine();
		
		char theChar = charString.charAt(0);
		int occurs = 0;
		
		for (int pos = 0; pos < inString.length(); pos++)
		{
			char current = inString.charAt(pos);
			if (current == theChar)
				occurs++;
			
		}
		System.out.println("Characters occurs " + occurs + " times");
		kb.close();
	}

}
