import java.util.*;

public class problem1362A 
{
	private static Scanner in =  new Scanner(System.in);
	private static int t = 0, count = 0, steps = 0;
	private static long a = 0, b = 0;
	public static void main(String[] args) 
	{
		t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			a = in.nextLong(); b = in.nextLong(); count = 0; steps = 0;
			if (a > b)
			{
				if (a % b == 0)
				{
					a /= b;
					while (a % 2 == 0) { a /= 2; count++; }
					if (a == 1) 
					{ 
						steps += count / 3; count %= 3;
	        			steps += count / 2; count %= 2;
	        			steps += count / 1; count %= 1;
	        			System.out.println(steps);
					}
					else System.out.println(-1);
				}
				else System.out.println(-1);
			}
			else if (a < b)
			{
				if (b % a == 0)
				{
					b /= a;
					while (b % 2 == 0) { b /= 2; count++; }
					if (b == 1) 
					{ 
						steps += count / 3; count %= 3;
	        			steps += count / 2; count %= 2;
	        			steps += count / 1; count %= 1;
	        			System.out.println(steps);
					}
					else System.out.println(-1);
				}
				else System.out.println(-1);
			}
			else System.out.println(0);
		}
	}
}
