import java.util.*;

public class problem1155A 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0;
	private static String s = "";
	private static char prev = '\0';
	private static boolean found = false;
	public static void main(String[] args) 
	{
		n = in.nextInt(); s = in.next(); prev = s.charAt(0);
		for (int i = 1; i < n; i++)
		{
			if (s.charAt(i) < prev) 
			{ 
				found = true; 
				System.out.println("YES"); System.out.print(i); System.out.println(" " + (i + 1)); 
				break; 
			}
			prev = s.charAt(i);
		}
		if (!found) System.out.println("NO");
	}
}
