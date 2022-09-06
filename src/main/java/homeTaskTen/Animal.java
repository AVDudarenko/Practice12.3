package homeTaskTen;

public class Animal implements Comparable<Animal> {

	private final String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int compareTo(Animal animal) {
		return name.compareTo(animal.getName());
	}
}
