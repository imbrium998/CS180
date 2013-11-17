
/**
 * 
 * @author davidklink
 *
 */

public class Rectangle 
{
	public String name;
	public double length;
	public double width;
	
	public void initialize(String name, double length, double width)
	{
		this.name = name;
		this.length = length;
		this.width = width;
		this.toString();
	}
	
	
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
	public String toString()
	{
		return name + " ( " + length + "," + width + ")";
	}
	
	// constructor
	public Rectangle( String name, double length, double width )
	{
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public Rectangle()
	
	{
		this(10.0,10.0);
	}
}
