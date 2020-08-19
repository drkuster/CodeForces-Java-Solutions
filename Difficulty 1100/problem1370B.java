import java.util.*;

public class problem1370B 
{
	private static Scanner in = new Scanner(System.in);
	private static int t = 0, n = 0;
	private static int [] nums;
	public static void main(String[] args) 
	{
		t = in.nextInt();
		for (int z = 0; z < t; z++)
		{
			n = in.nextInt(); nums = new int[2 * n];
			ArrayList<Integer> odds = new ArrayList<Integer>(); ArrayList<Integer> evens = new ArrayList<Integer>();
			for (int i = 0; i < (2 * n); i++)
			{
				nums[i] = in.nextInt();
				if (nums[i] % 2 == 1) odds.add(i + 1);
				else evens.add(i + 1);
			}
			for (int i = 0; i < (n - 1); i++)
			{
				if (odds.size() > 1)
				{
					System.out.println(odds.get(0) + " " + odds.get(1));
					odds.remove(0); odds.remove(0);
				}
				else
				{
					if (evens.size() > 1)
					{
						System.out.println(evens.get(0) + " " + evens.get(1));
						evens.remove(0); evens.remove(0);
					}
				}
			}
			nums = null;
		}
	}
}
