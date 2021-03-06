import java.util.*;

/**
 * Program which programs a student's schedule
 */
public class StudentSchedule {
	ArrayList<String>activityList = new ArrayList<String>();
	ArrayList<Double>activityTimes = new ArrayList<Double>();
	public double totalNumbersOfHours = 24.0;
	int wakeUpTime = 0;
	int sleepingTime = 0;
	String name = "";
	
	/**
	 * Constructor which gets the wake up time, sleeping time, and activities from user input.
	 */
	public StudentSchedule() {
		System.out.println("MVHACKS II Student Schedule\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name:");
		name = sc.next();
		System.out.println("What time do you wake up?(Answer in terms of international time & hour): ");
		wakeUpTime = sc.nextInt();
		System.out.println("What time do you sleep?(Answer in terms of international time & hour): ");
		sleepingTime = sc.nextInt();
		System.out.println("Enter the total number of activities that you have: ");
		int totalActivities = sc.nextInt();
		for(int numberOfActivities = 1; numberOfActivities <= totalActivities; numberOfActivities++) {
			System.out.println("Enter the name for activity " + numberOfActivities + ": ");
			activityList.add(sc.next());
			System.out.println("Enter the amount of time in terms of hours for activity " + numberOfActivities + ": ");
			activityTimes.add(sc.nextDouble());
		}
		System.out.println();
	}
	
	public void printSchedule(ArrayList<String> activities, ArrayList<Double> time){
		System.out.println(name + "'s Schedule\n");
		for(int i = 0; i < activities.size(); i++) {
			System.out.println(activities.get(i));
		}
	}
	
	public ArrayList<String> getActivityList() {
		return activityList;
	}
	
	public ArrayList<Double> getTime() {
		return activityTimes;
	}
}

