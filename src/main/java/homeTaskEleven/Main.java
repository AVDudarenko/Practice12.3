package homeTaskEleven;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Comparator<Animal> animalComparator = new AnimalNameComapartor().thenComparing(new AnimalColorComparator());
		TreeSet<Animal> animals = new TreeSet<>(animalComparator);
		animals.add(new Animal("Lion", "Orange"));
		animals.add(new Animal("Elephant", "Grey"));
		animals.add(new Animal("Wolf", "Grey"));
		animals.add(new Animal("Antelope", "Blue"));

		for (Animal animal : animals) {
			System.out.println(animal.getName() + " " + animal.getColor());
		}
	}
}
