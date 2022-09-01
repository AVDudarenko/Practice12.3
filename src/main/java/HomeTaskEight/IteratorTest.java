package HomeTaskEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		Integer[] arrayOfNumbers = {1, 2, 2, 2, 2, 4, 56, 17, 46};
		String[] arrayOfStrings = {"sdad", "sdsd", "adad", "adsfas"};
		Double[] arrayOfDouble = {23.4132, 322.9, 2.42, 3.111};

		ArrayList<Integer> arrayListOfNumbers = new ArrayList<>(Arrays.asList(arrayOfNumbers));
		ArrayList<String> arrayListOfStrings = new ArrayList<>(Arrays.asList(arrayOfStrings));
		ArrayList<Double> arrayListOfDouble = new ArrayList<>(Arrays.asList(arrayOfDouble));

		Iterator<Integer> numbersListIterator = arrayListOfNumbers.iterator();
		Iterator<String> stringsListIterator = arrayListOfStrings.iterator();
		Iterator<Double> doubleListIterator = arrayListOfDouble.iterator();

		while (numbersListIterator.hasNext()) {
			int n = numbersListIterator.next();
			if (n % 2 != 0) {
				numbersListIterator.remove();
			}
		}
		System.out.println(arrayListOfNumbers);
	}

}
