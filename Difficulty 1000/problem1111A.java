import java.util.*;

public class problem1111A 
{
	private static Scanner in = new Scanner(System.in);
	private static String s = "", t = "";
	private static boolean transform = true;
	public static void main(String[] args) 
	{
		s = in.next(); t = in.next();
		if (s.length() != t.length()) System.out.println("No");
		else
		{
			for (int i = 0; i < s.length(); i++)
			{
				if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))
				{
					if ((t.charAt(i) != 'a') && (t.charAt(i) != 'e') && (t.charAt(i) != 'i') && (t.charAt(i) != 'o') && (t.charAt(i) != 'u'))
					{
						transform = false; break;
					}
				}
				else
				{
					if ((t.charAt(i) == 'a') || (t.charAt(i) == 'e') || (t.charAt(i) == 'i') || (t.charAt(i) == 'o') || (t.charAt(i) == 'u'))
					{
						transform = false; break;
					}
				}
			}
			if (transform) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
