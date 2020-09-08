import java.util.*;

public class problem988B {
	private static Scanner in = new Scanner(System.in);
	private static int n = 0;
	private static ArrayList<String> rD = new ArrayList<String>();
	private static boolean possible = true;
	public static void main(String[] args) {
		n = in.nextInt();
		for (int i = 0; i < n; i++) rD.add(in.next());
		Collections.sort(rD, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		for (int i = n - 1; i > 0; i--) {
			if (rD.get(i).indexOf(rD.get(i - 1)) == -1) possible = false;
		}
		if (possible) {
			System.out.println("YES");
			for (int i = 0; i < n; i++) System.out.println(rD.get(i));
		}
		else System.out.println("NO");
	}
}
