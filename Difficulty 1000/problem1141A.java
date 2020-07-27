import java.util.*;

public class problem1141A 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, m = 0, d = 0, steps = 0;
	public static void main(String[] args) 
	{
		n = in.nextInt(); m = in.nextInt();
		if (m == n) System.out.println(0);
		else if (m % n == 0)
		{
			d = m / n;
			while (d % 2 == 0) { d /= 2; steps++; }
			while (d % 3 == 0) { d /= 3; steps++; }
			if (d == 1) System.out.println(steps);
			else System.out.println(-1);
		}
		else System.out.println(-1);
	}
}
