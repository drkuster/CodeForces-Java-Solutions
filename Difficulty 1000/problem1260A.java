import java.util.*;

public class problem1260A 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0;
	private static long c = 0, sum = 0;
	public static void main(String[] args) 
	{
		n = in.nextInt();
		for (int i = 0; i < n; i++)
		{
			c = in.nextLong(); sum = in.nextLong();
			if (sum % c == 0) System.out.println(((sum / c) * (sum / c)) *  c);
			else
			{
				if (c >= sum) System.out.println(sum);
				else
				{
					long h1 = (sum % c) * (((sum / c) + 1) * ((sum / c) + 1));
					long h2 = (c - (sum % c)) * ((sum / c) * (sum / c));
					System.out.println(h1 + h2);
				}
			}
		}
	}
}
