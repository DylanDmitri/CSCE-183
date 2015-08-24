import java.util.Scanner;

public class TimeDilation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);

		System.out.print("Percent: ");
		double percent = console.nextDouble();

		System.out.print("Time: ");
		double startTime = console.nextDouble();

		double time = startTime / Math.sqrt(1 - percent * percent);

		int years = (int) time / 8766;
		time -= years * 8766;
		int weeks = (int) time / 168;
		time -= weeks * 168;
		int days = (int) time / 24;
		time -= days * 24;
		int hours = (int) time;
		time -= hours;
		double minutes = time * 60;

		System.out.println();
		System.out.println("Traveling " + startTime + " hour(s) in your space ship ");
		System.out.println("at " + percent * 100 + "% the speed of light, ");
		System.out.println("your friends on Earth would experience ");
		if (years > 0) {
			System.out.println(years + " year(s)");
			
		}
		if (weeks > 0) {
			System.out.println(weeks + " week(s)");
			
		}
		if (days > 0) {
			System.out.println(days + " day(s)");
			
		}
		if (hours > 0) {
			System.out.println(hours + " hour(s)");
			
		}
		if (minutes > 0) {
			System.out.printf("%.2f minute(s)", minutes);
			
		}
	}

}
