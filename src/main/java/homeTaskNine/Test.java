package homeTaskNine;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();

		Test test = new Test();
		test.sortNumbers(a, b, c);
	}

	private void sortNumbers(int a, int b, int c) {
		int[] array = new int[]{a, b, c};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
