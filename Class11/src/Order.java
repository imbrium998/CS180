



public class Order {

	// class variable
	private static int orderMaster = 0;
	
	//instance variable
	int orderNum;
	Time orderTime;
	int items;
	
	public Order()
	{
		orderNum = orderMaster++;
	}
	
	public void setTime(Time orderTime)
	{
		this.orderTime = orderTime;
	}
	public void setItem(int items)
	{
		this.items = items;
		
		items++;
		System.out.println("In Order instance: " + items);
	}
	
	
	public String toString()
	{
		return "Order Number :" + orderNum;
	}


}
