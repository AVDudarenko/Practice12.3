package HomeWorkFive;

import java.util.ArrayDeque;

public class Capitals {

	public static void main(String[] args) {
		ArrayDeque<String> capitals = new ArrayDeque<>();
		capitals.addFirst("Minsk");
		capitals.addLast("Washington");
		capitals.addFirst("Warsaw");
		capitals.addFirst("Kiev");
		capitals.addLast("Berlin");

		System.out.println(capitals.getFirst());
		System.out.println(capitals.getLast());
		System.out.println(capitals.size());
	}
}
