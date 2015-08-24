import java.util.Scanner;

public class CellPhone {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Plan Minutes: ");
		double planMinutes = console.nextDouble();
		
		System.out.print("Day: ");
		int currDay = console.nextInt();
		
		System.out.print("Minutes Used: ");
		double usedMinutes = console.nextDouble();
		
		int daysLeft = 30 - currDay;
		double actualMean = usedMinutes / currDay;
		double targetMean = planMinutes / 30;
		
		System.out.println(currDay + " days used, " + daysLeft + " days remaining");
		if(actualMean > targetMean){
			System.out.println("Your average daily use (" + actualMean + " min/day) exceedes your minute plan of (" + targetMean + " min/day).");
			System.out.println("If you continue this usage, you'll exceed your plan by " + (actualMean * 30 - planMinutes) + " minutes");
		}else{			
			System.out.println("Your average daily use (" + actualMean + " min/day) is less than your average minutes per day (" + targetMean + " min/day).");
			System.out.println("If you continue this usage, you'll have " + (planMinutes - actualMean * 30) + " minutes remaining at the end of the month");
		}
		System.out.println("To meet your limit, you should average " + ((planMinutes - usedMinutes) / daysLeft)  + " min/day for the remainder of the month.");
		console.close();

	}

}
