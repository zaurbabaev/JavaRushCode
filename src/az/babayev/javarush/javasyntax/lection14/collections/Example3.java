package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
        for (int i = 0; i < 10; i++) {
            System.out.print(lottery.get(i)+" ");
        }
    }
}
