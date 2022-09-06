package homeTaskTen;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<Animal> animals = new TreeSet<>();
		animals.add(new Animal("Lion"));
		animals.add(new Animal("Elephant"));
		animals.add(new Animal("Wolf"));
		animals.add(new Animal("Amon"));

		for (Animal animal : animals) {
			System.out.println(animal.getName());
		}
	}
}
