package az.babayev.javarush.javasyntax.lection7;

public class MethodEx4 {
    public static String multiple(String text, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(text).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String hello = multiple("Hello", 4);
        System.out.println(hello);
    }
}
