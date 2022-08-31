package HomeTaskSeven;

import java.util.HashSet;
import java.util.Scanner;

public class SetOfNumbers {

	public static void main(String[] args) {
		String lineOfNumbers;
		Scanner scanner = new Scanner(System.in);
		lineOfNumbers = scanner.nextLine();
		scanner.close();
		SetOfNumbers setOfNumbers = new SetOfNumbers();
		setOfNumbers.convertStringToArray(lineOfNumbers);

	}

	private void convertStringToArray(String line) {

		String[] parts = line.split(" ");
		HashSet<Integer> arrayOfNumbers = new HashSet<>();
		for (String part : parts) {
			arrayOfNumbers.add(Integer.parseInt(part));
		}
		for (Integer number: arrayOfNumbers){
			System.out.println(number.toString());
		}

	}

}
