package az.babayev.javarush.javasyntax_repetition.lection3;

import java.util.Locale;

public class PrintfExample {


    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        int x = 5;
        int y = 6;
        System.out.printf("x=%d; y=%d %n", x, y);

        String name = "Tom";
        int age = 25;
        double height = 1.75;
        System.out.printf("My name is %s, me %d years old, my height is %.4f metr. %n"
                , name, age, height);
    }
}
