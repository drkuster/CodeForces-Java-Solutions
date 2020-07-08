import java.util.*;

public class problem764B 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, block = 0, endPos = 0;
	private static int[] blocks;
	public static void main(String[] args) 
	{
		n = in.nextInt();
		blocks = new int[n];
		for (int i = 0; i < n; i++) { block = in.nextInt(); blocks[i] = block; }
		endPos = (n / 2) + (n % 2);
		for (int i = 0; i < endPos; i += 2)
		{
			int temp = blocks[i];
			blocks[i] = blocks[(n - 1) - i];
			blocks[(n - 1) - i] = temp;
		}
		for (int i = 0; i < n; i++) { System.out.print(blocks[i] + " "); }
		System.out.println();
	}
}
