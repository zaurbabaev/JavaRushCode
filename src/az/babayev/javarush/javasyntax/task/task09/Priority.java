package az.babayev.javarush.javasyntax.task.task09;

/*
Внеси исправления в метод main(), чтобы он выводил в консоли число 12.
 */
public class Priority {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }
}
