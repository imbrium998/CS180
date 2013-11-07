

public class RectangleTestOne 
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle();
		rectangle1.initialize("Frank", 12.0, 9.0);
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.name = "Sally";
		rectangle2.width = 12.0;
		rectangle2.length = 13.135;
		
		double area1 = rectangle1.area();
		double perimeter1 = rectangle1.perimeter();
		
		
		double area2 = rectangle2.area();
		double perimeter2 = rectangle2.perimeter();
		
		
		
		rectangle1.print();
		rectangle2.print();
		

	}
}
