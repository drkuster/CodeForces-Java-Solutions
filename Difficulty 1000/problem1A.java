import java.util.*;

public class problem1A 
{
	private static Scanner in = new Scanner(System.in);
	private static long n = 0, m = 0, a = 0, nLength = 0, mLength = 0;
	public static void main(String[] args) 
	{
		n = in.nextLong(); m = in.nextLong(); a = in.nextLong();
		nLength = (int) Math.ceil((double) n / (double) a);
		mLength = (int) Math.ceil((double) m / (double) a);
		System.out.println(nLength * mLength);
	}
}
