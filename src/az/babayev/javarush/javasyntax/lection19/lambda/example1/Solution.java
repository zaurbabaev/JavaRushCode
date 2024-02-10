package az.babayev.javarush.javasyntax.lection19.lambda.example1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Runnable timer = new Timer();
        timer.run();
        Runnable calendar = new Calendar();
        calendar.run();

        System.out.println("-".repeat(30));

        ArrayList<Runnable> list = new ArrayList<>(List.of(
                new Timer(),
                new Calendar()
        ));

//        list.forEach(runnable -> runnable.run());

        list.forEach(Runnable::run);
    }
}
