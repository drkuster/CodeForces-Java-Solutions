import java.util.*;

public class problem1395B 
{
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, m = 0, sx = 0, sy = 0;
	public static void main(String[] args) 
	{
		n = in.nextInt(); m = in.nextInt(); sy = in.nextInt(); sx = in.nextInt();
		int [] endPos = coverStartRow(m, sx, sy);
		endPos = coverBottom(m, n, endPos[0], endPos[1]);
		coverTop(m, n, endPos[0], endPos[1]);
	}
	
	public static void coverTop(int xBound, int yBound, int x, int y)
	{
		int [] endPos = {x, y};
		for (int i = y; i >= 1; i--)
		{
			if (endPos[0] == 1) endPos = coverRowRight(xBound, yBound, endPos[0], endPos[1], -1);
			else endPos = coverRowLeft(xBound, yBound, endPos[0], endPos[1], -1);
		}
	}
	
	public static int [] coverBottom(int xBound, int yBound, int x, int y)
	{
		int [] endPos = {x, y};
		for (int i = y; i <= yBound; i++)
		{
			if (endPos[0] == xBound) endPos = coverRowLeft(xBound, yBound, endPos[0], endPos[1], 1);
			else endPos = coverRowRight(xBound, yBound, endPos[0], endPos[1], 1);
		}
		endPos[1] = sy - 1;
		return endPos; 
	}
	
	public static int [] coverRowLeft(int xBound, int yBound, int x, int y, int offset)
	{
		for (int i = x; i >= 1; i--) System.out.println(y + " " + i);
		int [] endPos = {1, y + offset};
		return endPos; 
	}
	
	public static int [] coverRowRight(int xBound, int yBound, int x, int y, int offset)
	{
		for (int i = 1; i <= xBound; i++) System.out.println(y + " " + i);
		int [] endPos = {xBound, y + offset};
		return endPos; 
	}
	
	public static int [] coverStartRow(int xBound, int x, int y)
	{
		for (int i = x; i >= 1; i--) System.out.println(y + " " + i);
		int startPos = x + 1;
		for (int i = startPos; i <= xBound; i++) System.out.println(y + " " + i);
		int [] endPos = {xBound, y + 1};
		return endPos;
	}
}
