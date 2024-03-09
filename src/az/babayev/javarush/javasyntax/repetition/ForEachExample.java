package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        for (String s : daysOfWeek) {
            System.out.println(s);
        }
        System.out.println("-".repeat(30));
        Arrays.stream(daysOfWeek).forEach(System.out::println);

        for (int i = 0; i > -1; i++) {
            if (i % 1000000 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Loop end");
    }
}
