package HomeTaskSeven;

import java.util.ArrayList;

public class HeavyBox {

	int weight;

	public HeavyBox(int weight) {
		this.weight = weight;
	}

	public static void main(String[] args) {
		ArrayList<HeavyBox> arrayOfHeavyBox = new ArrayList<>();
		HeavyBox heavyBoxOne = new HeavyBox(0);
		HeavyBox heavyBoxTwo = new HeavyBox(2);
		HeavyBox heavyBoxThree = new HeavyBox(3);
		HeavyBox heavyBoxFour = new HeavyBox(4);
		HeavyBox heavyBoxFive = new HeavyBox(5);

		arrayOfHeavyBox.add(heavyBoxOne);
		arrayOfHeavyBox.add(heavyBoxTwo);
		arrayOfHeavyBox.add(heavyBoxThree);
		arrayOfHeavyBox.add(heavyBoxFour);
		arrayOfHeavyBox.add(heavyBoxFive);

		System.out.println("Print all elements: ");
		for (HeavyBox heavyBox : arrayOfHeavyBox) {
			System.out.println(heavyBox.weight);
		}

		arrayOfHeavyBox.get(0).weight += 1;
		int lastElementIndex = arrayOfHeavyBox.size() - 1;
		arrayOfHeavyBox.remove(lastElementIndex);

		//Option one
		HeavyBox[] arrayOne = arrayOfHeavyBox.toArray(new HeavyBox[0]);
		System.out.println("Option one: ");
		for (HeavyBox box : arrayOne) {
			System.out.println(box.weight);
		}

		//Option two
		HeavyBox[] weightArray = new HeavyBox[arrayOfHeavyBox.size()];
		for (int i = 0; i < arrayOfHeavyBox.size(); i++) {
			weightArray[i] = arrayOfHeavyBox.get(i);
		}
		System.out.println("Option two: ");
		for (HeavyBox box : weightArray) {
			System.out.println(box.weight);
		}

		//Option three
		HeavyBox[] weightArrayStream = arrayOfHeavyBox.stream()
				.toArray(HeavyBox[]::new);
		System.out.println("Option three: ");
		for (HeavyBox box : weightArrayStream) {
			System.out.println(box.weight);
		}

	}

}
