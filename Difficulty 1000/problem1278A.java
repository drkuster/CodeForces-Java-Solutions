import java.util.*;

public class problem1278A 
{
	private static Scanner in = new Scanner(System.in);
	private static int t = 0, pSum = 0, hSum = 0, lastPos = 0, firstPos = 0;
	private static String p = "", h = "", ogP = "";
	private static boolean solved = false, stop = false;
	public static void main(String[] args) 
	{
		t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			firstPos = pSum = hSum = 0; stop = solved = false; p = in.next(); h = in.next(); ogP = p; lastPos = p.length() - 1;
			if (p.length() > h.length()) System.out.println("NO");
			else
			{
				for (int j = 0; j < p.length(); j++) pSum += (int) p.charAt(j);
				for (int j = 0; j < p.length(); j++) hSum += (int) h.charAt(j);
				if (pSum == hSum)
				{
					for (int j = firstPos; j <= lastPos; j++)
					{
						if (p.indexOf(h.charAt(j)) != -1) p = charRemoveAt(p, p.indexOf(h.charAt(j)));
						else break;
					}
					if (p.contentEquals("")) { System.out.println("YES"); stop = true; }
				}
				if (!stop)
				{
					while (lastPos < h.length() - 1)
					{
						hSum -= (int) h.charAt(firstPos); 
						hSum += (int) h.charAt(lastPos + 1);
						firstPos++; lastPos++;
						if (pSum == hSum) 
						{
							for (int j = firstPos; j <= lastPos; j++)
							{
								if (p.indexOf(h.charAt(j)) != -1) p = charRemoveAt(p, p.indexOf(h.charAt(j)));
								else break;
							}
							if (p.contentEquals("")) { solved = true; break; }
							else p = ogP;
						}
					}
					if (solved) System.out.println("YES");
					else System.out.println("NO");
				}
			}
		}
	}
	
	public static String charRemoveAt(String str, int p) 
	{  
		return str.substring(0, p) + str.substring(p + 1);  
    }  
}
