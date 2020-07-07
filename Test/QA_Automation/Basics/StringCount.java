package Basics;

import java.util.HashMap;

public class StringCount {
	public static void main(String[] args) {
		String abc = "hello world hello hello";
		String arrayOfStrings[] = abc.split(" ");
		/*for (int i = 0; i < arrayOfStrings.length; i++) {
			System.out.println(arrayOfStrings[i]);
		}
*/
		HashMap<String, Integer> Map = new HashMap<String, Integer>();
		for (int i = 0; i < arrayOfStrings.length; i++) {
			Map.putIfAbsent(arrayOfStrings[i], 0);

			Map.put(arrayOfStrings[i], Map.get(arrayOfStrings[i]) + 1);
		}

		System.out.println(Map.toString());
	}

}
