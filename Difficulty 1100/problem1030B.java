import java.util.*;

public class problem1030B 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, d = 0, m = 0, bTL = 0, bBL = 0;
	public static void main(String[] args) 
	{
		n = in.nextInt(); d = in.nextInt();
		bTL = d; bBL = d * -1;
		m = in.nextInt();
		for(int i = 0; i < m; i++)
		{
			int x = in.nextInt(); int y = in.nextInt();
			if(((x + bTL) >= y) && (x + bBL <= y))
			{
				int bLL = n + (n - d); int bRL = d;
				if((((x * -1) + bLL) >= y) && (((x * -1) + bRL) <= y)) System.out.println("YES");
				else System.out.println("NO");
			}
			else System.out.println("NO");
		}
	}
}
