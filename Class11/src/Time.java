



public class Time {

	public final static Time NOON = new Time(12,00);
	private int hour;
	private int minute;
	
	
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	
	public int getHour()
	{
		return this.hour;
	}
	
	
	public int getMinute()
	{
		return this.minute;
	}
	
	
	public boolean setTime(int hour, int minute)
	{
		boolean isValid = true;
		
		if (( hour < 0) || (hour > 23))
		
		{System.out.println("Invalid value of hour:");
			isValid = false;}
		
		if (( minute < 0) || (minute > 59))
		{System.out.println("Invalid value of minute:");
			isValid = false;}
	
		else {isValid = true;}
		
		this.hour = hour;
		this.minute = minute;
		return isValid;
	}	
	
	
	public int toMinutes()
	{
		int totalTime = 0;
		
		totalTime = minute + (hour * 60);
		return totalTime;
	}
	
	
	public String getAMPMtime()
	{
		int amPmHour = hour;
		String amOrPm = "AM";
		
		if (hour > 12) 
			{amPmHour = (hour - 12);}
		
		if (hour >= 12)
			amOrPm = "PM";
		
		String returnString = (hour + ":" + minute + " " + amOrPm);
		
		return returnString;
	}
	
	
	public Time timeAfter(int min)
	{
		int newMinutes = min + this.toMinutes();
		Time newTime = new Time(00,00);
		newTime.setTime(newMinutes/60%24, newMinutes%60);
		return null;
	}
	
}
