//Jorge Castellano
package kata2;

import java.util.HashMap;

public class HashMapMostFrequent {

	public static void main(String[] args) {
		int[] elements = { 1,4,7,1,1,8,4,1,4,9 };
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int index = 0; index < elements.length; index++){
			Integer frequency = frequencyMap.get(elements[index]);
			if(frequency == null)
				frequencyMap.put(elements[index], 1);
			else
				frequencyMap.put(elements[index], frequency + 1);
		System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");

		}

	}
}
