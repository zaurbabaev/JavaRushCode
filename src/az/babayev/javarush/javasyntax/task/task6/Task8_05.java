package az.babayev.javarush.javasyntax.task.task6;

/*
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
 */
public class Task8_05 {

    public static void main(String[] args) {
        String s1 = multiply("Амиго");
        System.out.println(s1);
        String s2 = multiply("Амиго", 8);
        System.out.println(s2);
    }

    public static String multiply(String text) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}