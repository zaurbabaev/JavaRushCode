package az.babayev.javarush.javasyntax.lection13;

import java.util.ArrayList;

public class GenericEx {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + (Integer) numbers.get(i);
        }
        numbers.forEach(s -> System.out.print(s+" "));
        System.out.println();
        System.out.println(sum);

    }
}
