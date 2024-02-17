package az.babayev.javarush.javacore.task.task2.task1225;

public class Solution {

	public static void main(String[] args) {
		System.out.println(getObjectType(new Cat()));
		System.out.println(getObjectType(new Tiger()));
		System.out.println(getObjectType(new Lion()));
		System.out.println(getObjectType(new Bull()));
		System.out.println(getObjectType(new Cow()));
		System.out.println(getObjectType(new Animal()));
	}

	public static String getObjectType(Object o) {
		if (o instanceof Tiger) {
			return "Тигр";
		} else if (o instanceof Lion) {
			return "Лев";
		} else if (o instanceof Bull) {
			return "Бык";
		} else if (o instanceof Cow) {
			return "Корова";
		} else if (o instanceof Cat) {
			return "Кот";
		} else if (o instanceof Animal) {
			return "Животное";
		}
		return "Не опознанный объект ";
	}

}
