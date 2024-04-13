package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static Map<String, Double> grades = new HashMap<>();

    public static void addStudents() {
        grades = Map.of(
                "Ivan Ivanov", 8.5,
                "Petr Petrov", 7.5,
                "Mariya Sidrovna", 9.5,
                "Pavel Shevchenko", 8.5,
                "Andrey Sumin", 8.5);
    }

    public static void printStudents() {
        Set<String> strings = grades.keySet();
        System.out.println(strings);
    }

   public static void getAverageMark(){
       Set<String> key = grades.keySet();
       for (String value : key) {
           Double grade = grades.get(value);
           System.out.print(grade+" ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        addStudents();
        printStudents();
        getAverageMark();
    }
}
