package az.babayev.javarush.javacore.task.task2.task1224;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {

		System.out.println(getObjectType(new Cat()));
		System.out.println(getObjectType(new Tiger()));
		System.out.println(getObjectType(new Lion()));
		System.out.println(getObjectType(new Bull()));
		System.out.println(getObjectType(new Pig()));
	}

	// Map vasitəsilə
	public static String getObjectType(Object o) {
		Map<String, String> animals = new HashMap<String, String>(
				Map.of("Cat", "Кот", "Tiger", "Тигр", "Lion", "Лев", "Bull", "Бык"));
		return animals.getOrDefault(o.getClass().getSimpleName(), "Животное");
	}

	// instanceof vasitəsilə
	public static String getObjectType2(Object o) {
		if (o instanceof Cat) {
			return "Кот";
		} else if (o instanceof Tiger) {
			return "Тигр";
		} else if (o instanceof Lion) {
			return "Лев";
		} else if (o instanceof Bull) {
			return "Бык";
		} else {
			return "Животное";
		}
	}

	// switch vasitəsilə
	public static String getObjectType3(Object o) {
		return switch (o.getClass().getSimpleName()) {
		case "Cat" -> "Кот";
		case "Tiger" -> "Тигр";
		case "Lion" -> "Лев";
		case "Bull" -> "Бык";
		default -> "Животное";
		};
	}
}
