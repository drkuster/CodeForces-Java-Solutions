import java.util.*;

public class problem1350A 
{
	private static Scanner in;
	private static long t = 0, n = 0, k = 0;
	private static boolean found = false;
	public static void main(String[] args) 
	{
		in  = new Scanner(System.in);
		t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			n = in.nextLong();
			k = in.nextLong();
			found = false;
			if (n % 2 == 1)
			{
				for (int j = 3; j * j <= n; j++)
				{
					if (n % j == 0)
					{
						found = true;
						n += j;
						break;
					}
				}
				if (!found) n += n; 
				System.out.println(n + ((k - 1) * 2));
			}
			else
			{
				System.out.println(n + (k * 2));
			}
		}
	}
}
