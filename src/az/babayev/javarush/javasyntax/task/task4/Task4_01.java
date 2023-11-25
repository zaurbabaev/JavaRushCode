package az.babayev.javarush.javasyntax.task.task4;

/*
Написать метод compare(int number), чтобы он:
- выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
- выводил строку "Число больше 5", если параметр метода больше 5,
- выводил строку "Число равно 5", если параметр метода равен 5.
 */
public class Task4_01 {
    public static void main(String[] args) {
        compare(6);
        compare(3);
        compare(5);

    }

    public static void compare(int number) {
        if (number > 5) {
            System.out.println("Число больше 5");
        } else if (number < 5) {
            System.out.println("Число меньше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }
}
