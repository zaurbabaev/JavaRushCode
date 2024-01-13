package az.babayev.javarush.javasyntax.task.task10;

/*
Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.
 */
public class StringReverse {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}
