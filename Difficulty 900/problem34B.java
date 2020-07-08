import java.util.*;

public class problem34B 
{
	private static Scanner input;
	private static int m;
	private static int n;
	private static int profits;
	private static int numTvs;
	
	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		Vector<Integer> sets = new Vector<Integer>(n);
		for (int i = 0; i < n; i++)
		{
			int tv = input.nextInt();
			sets.add(tv);
		}
		Collections.sort(sets);
		profits = 0;
		numTvs = 0;
		while (numTvs < m)
		{
			if (sets.elementAt(0) < 0)
			{
				profits += sets.elementAt(0);
				sets.remove(0);
				numTvs += 1;
			}
			else { break; }
		}
		profits *= -1;
		System.out.println(profits);
	}
}
