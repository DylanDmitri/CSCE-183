
/**
 * @author Lee Fitchett And Dylan Grey
 * @Date 8/24/15
 * @Description: Calculates cost per mile driven
 */

import java.util.*;

public class Odometer {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Odometer Start: ");
		double odometerStart = console.nextDouble();

		System.out.print("Odometer End: ");
		double odometerEnd = console.nextDouble();

		System.out.print("Gallons Used: ");
		double gasUsed = console.nextDouble();

		System.out.print("Gas Price: ");
		double pricePerGallon = console.nextDouble();

		double milesDriven = odometerEnd - odometerStart;
		double milesPerGallon = milesDriven / gasUsed;
		double costPerMile = pricePerGallon / milesPerGallon;

		System.out.println();
		if (milesDriven > 0) {
			System.out.println("Miles Driven: " + milesDriven);
			System.out.println("Miles per gallon: " + milesPerGallon);
			System.out.printf("Cost per mile: $%.2f", costPerMile);
		} else {
			System.out.println("Invalid Milage");
		}

		console.close();
	}
}
