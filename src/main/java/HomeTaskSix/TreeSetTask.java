package HomeTaskSix;

import java.util.TreeSet;

public class 	TreeSetTask {

	public static void main(String[] args) {

		TreeSet<String> words = new TreeSet<>();
		words.add("New");
		words.add("Spring");
		words.add("Boot");
		words.add("This");
		words.add("Article");
		words.add("Gives");
		words.add("You");
		words.add("Step");
		words.add("Intro");
		words.add("Working");
		words.add("Alongside");
		words.add("Code");
		words.add("Example");
		words.add("That");
		words.add("Implements");
		words.add("Good");
		words.add("Old");
		words.add("Library");
		words.add("All");
		words.add("Way");

		for (String word : words) {
			System.out.println(word);
		}

		System.out.println(words.first());
		System.out.println(words.last());
	}
}
