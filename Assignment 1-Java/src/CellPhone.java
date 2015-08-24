import java.util.Scanner;

public class CellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("Your average daily use (" + actualMean + " min/day) exedes your minute plan of (" + targetMean + " min/day).");
			System.out.println("If you continue this usage, you'll exceed your plan by " + (actualMean * 30 - planMinutes));
		}else{			
			System.out.println("Your average daily use (" + actualMean + " min/day) is less than your minute plan of (" + targetMean + " min/day).");
			System.out.println("If you continue this usage, you'll have " + (planMinutes - actualMean * 30) + " minutes remaining at the end of the month");

		}
		System.out.println("To meet your limit, you should use " + ((planMinutes - usedMinutes) / daysLeft)  + " min/day.");
		console.close();

	}

}
