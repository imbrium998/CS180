
public class UseOrder {

	public static void main(String[] args) {
		int myItems = 15;
		
		Order one = new Order();
		
		
		System.out.println( "In UseOrder before: " + myItems);
		one.setItem(myItems);
		
	
		System.out.println( "In UseOrder after: " + myItems);

	}

}
