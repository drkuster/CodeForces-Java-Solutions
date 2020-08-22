import java.util.*;

public class problem950B 
{
	private static Scanner in = new Scanner(System.in);
	private static long n = 0, m = 0, files = 0, target = 0, sum = 0;
	private static int j = 0;
	public static void main(String[] args) 
	{
		n = in.nextInt(); m = in.nextInt(); 
		ArrayList<Integer> blocksN = new ArrayList<Integer>(); ArrayList<Integer> blocksM = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) blocksN.add(in.nextInt()); for (int i = 0; i < m; i++) blocksM.add(in.nextInt());
		for (int i = 0; i < n; i++)
		{
			target += blocksN.get(i);
			while (sum < target) { sum += blocksM.get(j); j++; }
			if (sum == target) { target = sum = 0; files++; }
		}
		System.out.println(files);
	}
}
