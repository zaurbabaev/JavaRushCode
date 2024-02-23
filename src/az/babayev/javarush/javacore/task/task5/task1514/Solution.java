package az.babayev.javarush.javacore.task.task5.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<Double, String> labels = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(2.4, "hello");
        labels.put(2.5, "Java");
        labels.put(4.2, "Amigo");
        labels.put(9.7, "Rush");
        labels.put(1.6, "Diego");
    }
}
