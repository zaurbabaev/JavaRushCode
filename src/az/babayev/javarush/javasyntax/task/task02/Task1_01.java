package az.babayev.javarush.javasyntax.task.task02;

/*
Допиши код в методе print, чтобы он выводил на экран каждую переданную в
него строку 4 раза.Каждый раз с новой строки.
 */
public class Task1_01 {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-idependent!");
    }

    public static void print(String text) {
        for (int i = 0; i < 4; i++) {
            System.out.println(text);
        }
    }
}
