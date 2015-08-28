import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pro2_2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Max Number: ");
		double max = console.nextDouble();
		console.nextLine();

		System.out.print("Numbers: ");
		String input = console.nextLine();

		List<Integer> includedNumbers = new ArrayList<Integer>();
		List<Integer> excludedNumbers = new ArrayList<Integer>();

		String[] stringNumbers = input.split(" ");
		int temp;
		for (String num : stringNumbers) {
			temp = Integer.parseInt(num);
			if (temp <= max && !includedNumbers.contains(temp)) {
				includedNumbers.add(temp);
			}
		}
		for (int i = 1; i <= max; i++) {
			if (!includedNumbers.contains(i)) {
				excludedNumbers.add(i);
			}
		}

		System.out.println(excludedNumbers);
		console.close();
	}

}
