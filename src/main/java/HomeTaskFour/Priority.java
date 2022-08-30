package HomeTaskFour;

import java.util.PriorityQueue;

public class Priority {
	double counterOfAverageLength;
	double counterOfAverageNumbers;
	String convertedNumberInString;
	static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(100);

	public static void main(String[] args) {

		Priority priority = new Priority();

		for (int i = 0; i < 100; i++) {
			priorityQueue.add((int) (Math.random() * 99 + 1));
		}

		System.out.println(priorityQueue);

		priority.findAverageLengthOfElements();
		priority.findAverageNumberOfElements();
	}

	private void findAverageLengthOfElements() {
		double sum = 0.0;
		for (int i : priorityQueue) {
			convertedNumberInString = Integer.toString(i);
			sum += convertedNumberInString.length();
		}
		counterOfAverageLength = sum / 100;
		System.out.println(counterOfAverageLength);
	}

	private void findAverageNumberOfElements() {
		double sum = 0.0;
		for (int i : priorityQueue) {
			sum += i;
		}
		counterOfAverageNumbers = sum / 100;
		System.out.println(counterOfAverageNumbers);
	}

}


