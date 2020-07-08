import java.util.*;

public class problem622B 
{
	private static Scanner in = new Scanner(System.in);
	private static String time = "";
	private static int hour = 0, minute = 0, offset = 0, extraHours = 0, extraMinutes = 0;
	public static void main(String[] args) 
	{
		time = in.nextLine();
		String[] parseStr = time.split(":", 2);
		hour = Integer.parseInt(parseStr[0]);
		minute = Integer.parseInt(parseStr[1]);
		offset = in.nextInt();
		extraHours = offset / 60;
		extraMinutes = offset % 60;
		hour += extraHours;
		minute += extraMinutes;
		if (minute > 59)
		{
			minute -= 60;
			hour++;
		}
		if (hour > 23)
		{
			while (hour > 23) hour -= 24;
		}
		if (hour < 10)
		{
			if (minute < 10) System.out.println("0" + hour + ":0" + minute);
			else System.out.println("0" + hour + ":" + minute);
		}
		else
		{
			if (minute < 10) System.out.println(hour + ":0" + minute);
			else System.out.println(hour + ":" + minute);
		}
	}

}
