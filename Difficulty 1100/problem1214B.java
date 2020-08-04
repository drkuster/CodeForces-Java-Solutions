import java.util.*;

public class problem1214B 
{
	private static Scanner in = new Scanner(System.in);
	private static int b = 0, g = 0, n = 0, e1G = 0, e2G = 0;
	public static void main(String[] args) 
	{
		b = in.nextInt(); g = in.nextInt(); n = in.nextInt();
		if (g >= n)
		{
			e1G = n; 
			if (b >= n) e2G = 0;
			else e2G = n - b;
		}
		else
		{
			e1G = g; 
			if (b >= n) e2G = 0;
			else e2G = n - b;
		}
		System.out.println(Math.abs(e2G - e1G) + 1);
	}
}
