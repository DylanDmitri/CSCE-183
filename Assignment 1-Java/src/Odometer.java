
/**
 * @author Lee Fitchett
 *
 */

import java.io.*;
import java.util.*;

public class Odometer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Miles Driven: " + milesDriven);
		System.out.println("Miles per gallon: " + milesPerGallon);
		System.out.printf("Cost per mile: $%.2f", costPerMile);

	}

}
