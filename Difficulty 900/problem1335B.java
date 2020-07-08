import java.util.*;

public class problem1335B 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = 0, n = 0, a = 0, b = 0;
		t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			String str = "";
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			if (a == b)
			{
				char start = 'a';
				for (int j = 0; j < n; j++) 
				{ 
					if (start == (char)('z' + 1)) { start = 'a'; }
					str += start; start += 1; 
				}
				System.out.println(str);
			}
			else if (b == 1)
			{
				for (int j = 0; j < n; j++) { str += 'a';}
				System.out.println(str);
			}
			else
			{
				int offset = 0;
				char start = 'a';
				for (int j = 0; j < n; j++)
				{
					if (offset == b) { offset = 0; }
					str += (char)(start + offset);
					offset += 1;
				}
				System.out.println(str);
			}
		}
	}

}
