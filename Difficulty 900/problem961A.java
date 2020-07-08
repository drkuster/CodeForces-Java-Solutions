import java.util.*;


public class problem961A 
{
	private static Scanner in;
	private static int n = 0, m = 0, block = 0, min;
	private static int[] board;
	
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		board = new int[n];
		for (int i = 0; i < m; i++)
		{
			block = in.nextInt();
			board[block - 1]++;
		}
		min = board[0];
		for (int i = 0; i < n; i++)
		{
			if (board[i] < min) min = board[i];
		}
		System.out.println(min);
	}
}
