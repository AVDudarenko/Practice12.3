package practiceOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainTwo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Person personOne = new Person(20, "Sasha");
		Person personTwo = new Person(30, "Masha");
		Person personThree = new Person(40, "Petya");
		Person personFour = new Person(50, "Galya");
		Person personFive = new Person(60, "Vasya");

		map.put(personOne.getName(), personOne.getAge());
		map.put(personTwo.getName(), personTwo.getAge());
		map.put(personThree.getName(), personThree.getAge());
		map.put(personFour.getName(), personFour.getAge());
		map.put(personFive.getName(), personFive.getAge());

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

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= a && entry.getValue() <= b) {
				System.out.println(entry.getKey());
			}
		}
	}
}
