package az.babayev.javarush.javasyntax.task.task04;

/*
Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки.
 */
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
