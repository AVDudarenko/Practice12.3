import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<Animal> linkedListAnimal = new LinkedList<>();
		Animal cat = new Animal("Cat");
		Animal dog = new Animal("Dog");
		Animal parrot = new Animal("Parrot");
		Animal hamster = new Animal("Hamster");
		Animal mouse = new Animal("Mouse");
		Animal rat = new Animal("Rat");
		Animal camel = new Animal("Camel");
		Animal elephant = new Animal("Elephant");
		Animal panda = new Animal("Panda");
		Animal elk = new Animal("Elk");

		linkedListAnimal.add(cat);
		linkedListAnimal.add(dog);
		linkedListAnimal.add(parrot);
		linkedListAnimal.add(hamster);
		linkedListAnimal.add(mouse);
		linkedListAnimal.add(rat);
		linkedListAnimal.add(camel);
		linkedListAnimal.add(elephant);
		linkedListAnimal.add(panda);
		linkedListAnimal.add(elk);


		/* Прошу объяснить, почему при использовании итератора, возникает Exception?
		Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:970)
	at java.base/java.util.LinkedList$ListItr.next(LinkedList.java:892)
	at Main.main(Main.java:38)
		 */

//		ListIterator<Animal> iteratorAnimal = linkedListAnimal.listIterator();
//
//		for (ListIterator<Animal> it = iteratorAnimal; it.hasNext();) {
//			Animal animal = it.next();
//			if (animal.name.substring(0, 1).matches("[AaEeUuIiOoYy]")) {
//				linkedListAnimal.remove(animal);
//			}
//		}

		for (int i = 0; i < linkedListAnimal.size(); i++) {
			if (linkedListAnimal.get(i).name.substring(0, 1).matches("[AaEeUuIiOoYy]")) {
				linkedListAnimal.remove(i);
			}
		}

		System.out.println(linkedListAnimal);

	}


}
