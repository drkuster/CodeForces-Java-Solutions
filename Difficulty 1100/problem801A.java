import java.util.*;

public class problem801A 
{
	private static Scanner in = new Scanner(System.in);
	private static String input = "";
	private static int minVK = 0;
	public static void main(String[] args) 
	{
	    input = in.next(); StringBuilder s = new StringBuilder(input);
	    for (int i = 1; i < s.length(); i++)
	    {
	        if (s.charAt(i) == 'K')
	        {
	            if (s.charAt(i - 1) == 'V')
	            {
	                minVK++;
	                s.setCharAt(i - 1, 'A'); s.setCharAt(i, 'A');
	            }
	        }
	    }
	    for (int i = 1; i < s.length(); i++)
	    {
	        if (s.charAt(i) == 'V')
	        {
	            if (s.charAt(i - 1) == 'V') { minVK++; break; }
	        }
	        else if (s.charAt(i) == 'K')
	        {
	            if (s.charAt(i - 1) == 'K') { minVK++; break; }
	        }   
	    }
	    System.out.println(minVK);
	}
}
