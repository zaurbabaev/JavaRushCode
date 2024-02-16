package az.babayev.javarush.javacore.task.task2.task1205;

import java.util.HashMap;
import java.util.Map;

/*
Напиши метод, который определяет, объект какого класса ему передали,
и возвращает результат: одно из значений — «Корова», «Кит», «Собака»,
«Неизвестное животное».
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType2(new Cow()));
        System.out.println(getObjectType2(new Dog()));
        System.out.println(getObjectType2(new Whale()));
        System.out.println(getObjectType2(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Whale) {
            return "Кит";
        } else if (o instanceof Dog) {
            return "Собака";
        }
        return "Неизвестное животное";
    }

    // map vasitəsilə
    public static String getObjectType2(Object o) {
        Map<String, String> animals = new HashMap<>();
        animals.put(Cow.class.getSimpleName(), "Корова");
        animals.put(Dog.class.getSimpleName(), "Собака");
        animals.put(Whale.class.getSimpleName(), "Кит");
        return animals.getOrDefault(o.getClass().getSimpleName(), "Неизвестное животное");
    }

    // switch vasitəsilə
    public static String getObjectType3(Object o) {

        return switch (o.getClass().getSimpleName()) {
            case "Cow" -> "Корова";
            case "Dog" -> "Собака";
            case "Whale" -> "Кит";
            default -> "Неизвестное животное";
        };
    }
}
