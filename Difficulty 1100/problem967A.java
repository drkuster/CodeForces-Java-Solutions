import java.util.*;

public class problem967A {
	private static Scanner in = new Scanner(System.in);
	private static int n = 0, s = 0;
	private static ArrayList<Time> schedule = new ArrayList<Time>();
	public static void main(String[] args) {
		n = in.nextInt(); s = in.nextInt();
		for (int i = 0; i < n; i++) {
			Time time = new Time(in.nextInt(), in.nextInt());
			schedule.add(time);
		}
		schedule.add(new Time(0, 0));
		Collections.sort(schedule, new SortByTime()); 
		if (insertInBeginning(schedule, s)) System.out.println(0 + " " + 0);
		else {
			for (int i = 0; i < n; i++) { // FIXME
				Time current = schedule.get(i);
				Time next = schedule.get(i + 1);
				int landingComplete = (current.hour * 60) + current.minute + 1;
				int nextLandingStart = (next.hour * 60) + next.minute;
				if (((float)nextLandingStart - (float)landingComplete) / 2.0 > s) {
					int optimalTime = landingComplete + s;
					System.out.print(optimalTime / 60);
					System.out.println(" " + optimalTime % 60);
					return;
				}
			}
			Time lastTime = schedule.get(n); // FIXME
			int landingComplete = (lastTime.hour * 60) + lastTime.minute + 1;
			int optimalTime = landingComplete + s;
			System.out.print(optimalTime / 60);
			System.out.println(" " + optimalTime % 60);
		}
	}
	
	public static boolean insertInBeginning(ArrayList<Time> time, int s) {
		int timeOfQuestion = (time.get(0).hour * 60) + time.get(0).minute + s;
		int nextTime = (time.get(1).hour * 60) + time.get(1).minute;
		return nextTime > timeOfQuestion;
	}
}

class Time {
	int hour;
	int minute;
	Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
}

class SortByTime implements Comparator<Time> 
{
	public int compare(Time o1, Time o2) {
		if (o1.hour == o2.hour) {
			return o1.minute - o2.minute;
		}
		else return o1.hour - o2.hour;
	} 
} 
