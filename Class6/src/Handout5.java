
public class Handout5 {

	public static void main(String[] args) {
		
		String someString = "one two three four";
		
		int pos = 0;
		int len = someString.length();
		
		while (pos < len)
		{
			char theChar = someString.charAt(pos);
			System.out.println(theChar);
			pos++;
		
		}
		
	}

}
