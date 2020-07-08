import java.util.*;

public class problem670A 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, min = 0, max = 0, guarOff = 0, daysRemaining = 0;
	public static void main(String[] args) 
	{
		n = in.nextInt();
		guarOff = (n / 7) * 2;
		daysRemaining = (n - (7 * (n / 7)));
		min = guarOff;
		if (daysRemaining - 5 > 0) { min++; max = guarOff + 2; }
		else if (daysRemaining == 0) min = max = guarOff;
		else { if (daysRemaining == 1) max = guarOff + 1; else max = guarOff + 2; }
		System.out.println(min + " " + max);
	}
}
