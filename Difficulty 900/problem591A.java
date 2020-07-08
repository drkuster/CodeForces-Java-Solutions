import java.util.*;

public class problem591A 
{
	private static Scanner in;
	private static int l = 0, p = 0, q = 0, totalSpeed = 0;
	private static double speedRatio = 0.0, dFromL = 0.0;
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		l = in.nextInt();
		p = in.nextInt();
		q = in.nextInt();
		totalSpeed = p + q;
		speedRatio = (double)p / (double)totalSpeed;
		dFromL = speedRatio * (double)l;
		System.out.println(dFromL);
	}
}
