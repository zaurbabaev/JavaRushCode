package az.babayev.javarush.javacore.task.task2.task1233;


import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		int[] data = new int[] { 1, 2, 3, 5, -2, -8, 0, 77, 5, 5 };
		Pair<Integer, Integer> result = getMinimumAndIndex2(data);
		System.out.println("The minimum is " + result.x);
		System.out.println("The index of minimum element is " + result.y);
	}

	public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {

		int min = array[0];
		int index = 0;

		if (array == null || array.length == 0) {
			return new Pair<Integer, Integer>(null, null);
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}

		return new Pair<Integer, Integer>(min, index);
	}

	// Stream vasitəsilə
	public static Pair<Integer, Integer> getMinimumAndIndex2(int[] array) {

		if (array == null || array.length == 0) {
			return new Pair<Integer, Integer>(null, null);
		}
		List<Integer> list = IntStream.of(array).boxed().toList();
//		Integer min = list.stream().min(Integer::compareTo).get();
		Integer min = Collections.min(list);
		return new Pair<Integer, Integer>(min, list.indexOf(min));
	}

}
