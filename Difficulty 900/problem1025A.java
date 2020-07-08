import java.util.*;

public class problem1025A 
{
	private static Scanner in;
	private static int n = 0, pos = 0;
	private static String dogs;
	private static char dog;
	private static int dogPound[] = new int[26];
	private static boolean possible = false;
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		n = in.nextInt();
		dogs = in.next();
		
		if (n < 2)
		{
			System.out.println("Yes");
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				dog = dogs.charAt(i);
				pos = (int)dog - 97;
				dogPound[pos]++;
				if (dogPound[pos] > 1)
				{
					possible = true;
					break;
				}
			}
			if (possible) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
