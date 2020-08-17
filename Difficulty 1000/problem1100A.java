import java.util.*;

public class problem1100A 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, k = 0, sE = 0, sS = 0, max = 0;
	private static int [] tabs, temp;
	public static void main(String[] args) 
	{
		n = in.nextInt(); k = in.nextInt(); tabs = new int [n]; temp = new int [n];
		for (int i = 0; i < n; i++) temp[i] = tabs[i] = in.nextInt();
		for (int i = 0; i < k; i++)
		{
			sE = sS = 0;
			for (int j = i; j < n; j += k) tabs[j] = 0;
			for (int j = 0; j < n; j++) { if (tabs[j] == 1) sE++; else if (tabs[j] == -1) sS++; }
			if (Math.abs(sE - sS) > max) max = Math.abs(sE - sS);
			tabs = Arrays.copyOf(temp, n);
		}
		System.out.print(max);
	}
}
