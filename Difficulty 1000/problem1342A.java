import java.util.*;

public class problem1342A 
{
	private static Scanner in = new Scanner(System.in);
	private static long t = 0, x = 0, y = 0, a = 0, b = 0, minD = 0;
	public static void main(String[] args) 
	{
		t = in.nextLong();
		for (int i = 0; i < t; i++)
		{
			x = in.nextLong(); y = in.nextLong(); a = in.nextLong(); b = in.nextLong();
			if ((a * 2) < b) minD = a * (x + y);
			else minD = (Math.min(x, y) * b) + ((Math.max(x, y) - Math.min(x, y)) * a);
			System.out.println(minD);
		}
	}
}
