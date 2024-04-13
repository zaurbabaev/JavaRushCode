package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
    public static Map<String, Double> grades = new HashMap<>();

    public static void addStudents() {
        grades = Map.of(
                "Ivan Ivanov", 8.5,
                "Petr Petrov", 7.5,
                "Mariya Sidrovna", 9.5,
                "Pavel Shevchenko", 8.5,
                "Andrey Sumin", 8.5);
    }

    public static void printStudentsInfo() {
        Set<Map.Entry<String, Double>> entries = grades.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.format("%s : %.1f \n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }
}
