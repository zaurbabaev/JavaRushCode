package az.babayev.javarush.javasyntax.task.task02;

/*
Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.
 */
public class Task8_04 {
    public static void print3(String text) {
        for (int i = 0; i < 3; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
