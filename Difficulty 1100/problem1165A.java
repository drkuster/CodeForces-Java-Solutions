import java.util.*;

public class problem1165A 
{
	private static Scanner in = new Scanner(System.in);
	private static String s = "";
	private static int x = 0, y = 0, count = 0;
	public static void main(String[] args) 
	{
		in.nextInt(); x = in.nextInt(); y = in.nextInt(); s = in.next();
		for (int i = s.length() - x; i < (s.length() - 1) - y; i++)
		{
			if (s.charAt(i) != '0') count++;
		}
		if (s.charAt((s.length() - 1) - y) != '1') count++;
		for (int i = s.length() - y; i < s.length(); i++)
		{
			if (s.charAt(i) != '0') count++;
		}
		System.out.println(count);
	}
}
