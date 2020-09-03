import java.util.*;

public class problem1335C 
{
	private static Scanner in = new Scanner(System.in);
	private static int t = 0, n = 0, max = 0, mode = 0, uniqueNums = 0;
	private static int students [] = new int[200001];
	public static void main(String[] args) 
	{
		t = in.nextInt();
		for (int z = 0; z < t; z++)
		{
			max = mode = uniqueNums = 0; n = in.nextInt();
			for (int i = 0; i < n; i++) 
			{ 
				int student = in.nextInt(); students[student]++;
				if (student > max) max = student;
			}
			
			for (int i = 1; i <= max; i++) { if (students[i] > mode) mode = students[i]; if (students[i] > 0) uniqueNums++; }
			uniqueNums--;
			if (mode > uniqueNums) { uniqueNums++; mode--; }
			System.out.println(Math.min(mode, uniqueNums));
			for (int i = 1; i <= max; i++) students[i] = 0;
		}
	}
}
