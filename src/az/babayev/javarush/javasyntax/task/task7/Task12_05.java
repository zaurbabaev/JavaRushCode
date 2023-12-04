package az.babayev.javarush.javasyntax.task.task7;

/*
Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку,
 воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.

Пример:
30
29
...
1
0
Бум!
 */
public class Task12_05 {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Бум!");
    }
}
