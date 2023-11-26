package az.babayev.javarush.javasyntax.task.task04;

/*
Вывести на экран числа от 10 до 1 включительно, используя цикл while.
Каждое значение с новой строки.
 */
public class Task10_02 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
