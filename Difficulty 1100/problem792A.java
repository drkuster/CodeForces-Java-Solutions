import java.util.*;

public class problem792A {
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, count = 1;
	private static long minDistance = 2000000001;
	private static ArrayList<Long> cities = new ArrayList<Long>();
	public static void main(String[] args) {
		n = in.nextInt();
		for (int i = 0; i < n; i++ ) cities.add(in.nextLong());
		Collections.sort(cities);
		for (int i = 0; i < (n - 1); i++) {
			long distance = Math.abs(cities.get(i) - cities.get(i + 1));
			if (distance < minDistance) {
				minDistance = distance;
				count = 1;
			}
			else if (distance == minDistance) count++;
		}
		System.out.println(minDistance + " " + count);
	}
}
