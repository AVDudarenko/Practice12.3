package HomeTaskSeven;

import java.util.ArrayList;

public class HeavyBox {

	ArrayList<Integer> hugeBox = new ArrayList<>();

	int weight;

	public HeavyBox(int weight) {
		this.weight = weight;
	}

	public HeavyBox() {

	}

	public static void main(String[] args) {

		HeavyBox heavyBoxObject = new HeavyBox();

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

		ArrayList<HeavyBox> boxesForSort = new ArrayList<>();
		HeavyBox boxForSortOne = new HeavyBox(100);
		HeavyBox boxForSortTwo = new HeavyBox(350);
		HeavyBox boxForSortThree = new HeavyBox(300);
		HeavyBox boxForSortFour = new HeavyBox(200);
		HeavyBox boxForSortFive = new HeavyBox(500);

		boxesForSort.add(boxForSortOne);
		boxesForSort.add(boxForSortTwo);
		boxesForSort.add(boxForSortThree);
		boxesForSort.add(boxForSortFour);
		boxesForSort.add(boxForSortFive);

		heavyBoxObject.sortBoxesByWeight(boxesForSort);


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

	private void sortBoxesByWeight(ArrayList<HeavyBox> boxes) {
		int counter = 0;
		for (HeavyBox box : boxes) {
			if (box.weight > 300) {
				hugeBox.add(counter, box.weight);
				counter++;
			}
		}
		System.out.println("Sorted boxes by weight:");
		for (Integer weight : hugeBox) {
			System.out.println(weight);
		}
	}

}
