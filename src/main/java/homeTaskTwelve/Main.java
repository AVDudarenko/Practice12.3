package homeTaskTwelve;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		HashMap<Integer, String> mapOfGoods = new HashMap<>();
		mapOfGoods.put(1234, "Cake");
		mapOfGoods.put(2345, "Bread");
		mapOfGoods.put(3456, "Butter");
		mapOfGoods.put(4567, "Meat");
		mapOfGoods.put(56789, "Beef");
		mapOfGoods.put(11111, "Pork");
		mapOfGoods.put(11111, "Water");
		mapOfGoods.put(1234, "Candies");

		for (Map.Entry<Integer, String> item : mapOfGoods.entrySet()) {
			int price = item.getKey();
			String name = item.getValue();
			System.out.println(price + " " + name);
		}

	}
}
