import java.util.Random;


public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for (int i=0; i<100 ;i++);
			{
				Random rand = new Random();
				
				double value = rand.nextDouble() * 100;
				
				System.out.println("value " + value);
				
				for(int j=0; j<100; j++);
				{
					System.out.println();
				}
			}
		
		
		
	}

}
