import java.util.*;

public class problem916A 
{
	private static Scanner in = new Scanner(System.in);
	private static short x = 0, hour = 0, minute = 0;
	private static int snooze = 0;
	public static void main(String[] args) 
	{
		x = in.nextShort();
		hour = in.nextShort();
		minute = in.nextShort();
		while ((!(Short.toString(hour).contains("7"))) && (!(Short.toString(minute).contains("7"))))
		{
			snooze++;
			minute -= x;
			if (minute < 0)
			{
				minute += 60;
				hour --;
				if (hour < 0)
				{
					hour += 24;
				}
			}
		}
		System.out.println(snooze);
	}

}
