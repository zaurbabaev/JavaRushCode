package az.babayev.javarush.javasyntax.lection7;

public class MethodEx2 {
    public static void printLines(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printLines("Hello", 4);
        String text = "Java";
        int count = 5;
        printLines(text, count);
    }
}
