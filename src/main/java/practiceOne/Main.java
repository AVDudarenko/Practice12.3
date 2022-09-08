package practiceOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = a, j = b; i <= b; i++, j--) {
			map.put(i, j);
		}
		System.out.println(map);
	}
}
