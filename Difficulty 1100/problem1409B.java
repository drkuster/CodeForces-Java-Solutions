import java.util.*;

public class problem1409B 
{
	private static Scanner in = new Scanner(System.in);
	private static long t = 0, a = 0, b = 0, x = 0, y = 0, n = 0;
	public static void main(String[] args) 
	{
		t = in.nextLong();
		for (int z = 0; z < t; z++)
		{
			a = in.nextLong(); b = in.nextLong(); x = in.nextLong(); y = in.nextLong(); n = in.nextLong();
			System.out.println(Math.min(takeAThenB(a, b, x, y, n), takeBThenA(a, b, x, y, n)));
		}
	}
	
	public static long takeAThenB(long a, long b, long x, long y, long n)
	{
		n -= (a - x); a = x;
		if (n < 0) a += n * -1;
		else
		{
			if (b - n < y) b = y;
			else b -= n;
		}
		return a * b;
	}
	
	public static long takeBThenA(long a, long b, long x, long y, long n)
	{
		n -= (b - y); b = y;
		if (n < 0) b += n * -1;
		else
		{
			if (a - n < x) a = x;
			else a -= n;
		}
		return a * b;
	}
}
