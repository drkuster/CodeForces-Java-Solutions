import java.util.*;

public class problem63A 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0;
	private static String captain = "", name = "", title = "";
	private static List<String> rats = new ArrayList<String>(), wAndC = new ArrayList<String>(), men = new ArrayList<String>();
	public static void main(String[] args) 
	{
		n = in.nextInt();
		for (int i = 0; i < n; i++)
		{
			name = in.next(); title = in.next();
			if (title.equals("captain")) captain = name;
			else if (title.equals("rat")) rats.add(name);
			else if ((title.equals("woman")) || (title.equals("child"))) wAndC.add(name);
			else men.add(name);
		}
		for (int i = 0; i < rats.size(); i++) System.out.println(rats.get(i));
		for (int i = 0; i < wAndC.size(); i++) System.out.println(wAndC.get(i));
		for (int i = 0; i < men.size(); i++) System.out.println(men.get(i));
		System.out.println(captain);
	}
}
