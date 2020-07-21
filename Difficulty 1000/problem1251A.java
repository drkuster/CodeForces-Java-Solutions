import java.util.*;

public class problem1251A 
{
	private static Scanner in = new Scanner(System.in);
	private static int t = 0;
	private static String s = "", nS = "";
	public static void main(String[] args) 
	{
		t = in.nextInt();
		for (int z = 0; z < t; z++)
		{
			s = in.next(); nS = "";
			while (s.length() > 0)
			{
				int i = 0, j = 0;
				while ((j < s.length()) && (s.charAt(i) == s.charAt(j))) j++;
				if ((j - i) % 2 == 1) nS += s.charAt(i);
				s = s.substring(j);
			}
			int count[] = new int[26];
			for (int i = 0; i < nS.length(); i++) count[nS.charAt(i) - 97]++;
			nS = "";
			for (int i = 0; i < 26; i++) if(count[i] > 0) nS += (char) (i + 97);
			char[] charArr = nS.toCharArray(); Arrays.sort(charArr);
			nS = new String(charArr); System.out.println(nS);
		}
	}
}
