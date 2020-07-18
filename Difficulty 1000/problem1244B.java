import java.util.*;

public class problem1244B 
{
	private static Scanner in = new Scanner(System.in);
	private static int t = 0, n = 0, x = 0, y = 0, steps = 0, max = 0;
	private static String s = "";
	private static boolean found = false;
	public static void main(String[] args) 
	{
		t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			n = in.nextInt(); s = in.next();
			max = steps = x = 0; y = n - 1; found = false;
			for (int z = 0; z <= n / 2; z++)
			{
				if (s.charAt(x) == '1') { max = (2 * n) - (steps * 2); found = true; break; }
				else if (s.charAt(y) == '1') { max = (2 * n) - (steps * 2); found = true; break; }
				x++; steps++; y--;
			}
			if (found) System.out.println(max);
			else System.out.println(n);
		}
	}
}
