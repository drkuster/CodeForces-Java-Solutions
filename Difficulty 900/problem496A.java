import java.util.*;

public class problem496A 
{
	private static int n = 0, hold = 0, max = 0, min = 1001, difference = 0, toRemove = 0;
	private static Vector<Integer> track;
	private static Scanner in;
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		n = in.nextInt();
		track = new Vector<Integer>(n);
		for (int i = 0; i < n; i++)
		{
			hold = in.nextInt();
			track.add(hold);
		}
		
		for (int i = 1; i < track.size() - 1; i++)
		{
			difference = (track.elementAt(i) - track.elementAt(i - 1)) + (track.elementAt(i + 1) - track.elementAt(i));
			if (difference < min)
			{
				min = difference;
				toRemove = i;
			}
		}
		track.remove(toRemove);
		for (int i = 1; i < track.size(); i++)
		{
			difference = track.elementAt(i) - track.elementAt(i - 1);
			if (difference > max) max = difference; 
		}
		System.out.println(max);
	}

}
