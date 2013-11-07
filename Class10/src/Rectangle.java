
/**
 * 
 * @author davidklink
 *
 */

public class Rectangle 
{
	public String name = "SomeRectangle";
	public double length = 1.0;
	public double width = 1.0;
	
	public double area()
	{
		double area;
		
		area = length * width;
		
		return area;
	}

	public double perimeter()
	{
		double perimeter;
		
		perimeter = 2.0 * (width + length);
		
		return perimeter;
	}
	
	public void print()
	{
		System.out.println(name);
		System.out.println("width " + width);
		System.out.println("length " + length);
		System.out.println("area " + area());
		System.out.println("perimeter " + perimeter());
		System.out.println();
		
	}
	
	
}
