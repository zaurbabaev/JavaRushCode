package az.babayev.javarush.javasyntax.repetition;

public class ForEachExample2 {
    public static void printAllElements(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void printAllElements2(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
