/**
 * 
 */

/**
 * @author davidklink
 *
 */
public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		DateSimple date1;
		date1 = new DateSimple();
		date1.month = "JAN";
		date1.day = 2;
		date1.year = 2013;
		
		DateSimple date2;
		date2 = new DateSimple();
		date2.month = "FEB";
		date2.year = 2013;
		
		System.out.println(date1.month + '-' + date1.day + '-' + date1.year);
	
	}

}
