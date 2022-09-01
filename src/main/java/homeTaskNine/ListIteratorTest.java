package homeTaskNine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		Integer[] arrayOfNumbers = {12, 323, 432423, 4242};
		ArrayList<Integer> arrayListOfIntegers = new ArrayList<>(Arrays.asList(arrayOfNumbers));
		ListIterator<Integer> listIteratorOfIntegers = arrayListOfIntegers.listIterator(arrayListOfIntegers.size());

		while (listIteratorOfIntegers.hasPrevious()) {
			int number = listIteratorOfIntegers.previous();
			System.out.println(number);
		}

		while (listIteratorOfIntegers.hasNext()) {
			listIteratorOfIntegers.next();
			listIteratorOfIntegers.remove();
		}

		System.out.println("Array list of int: " + arrayListOfIntegers);
	}
}
