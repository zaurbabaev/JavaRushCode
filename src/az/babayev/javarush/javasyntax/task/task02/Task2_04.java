package az.babayev.javarush.javasyntax.task.task02;

/*
В методе main объяви две переменные a и b типа int.
Присвой им любые значения.
Выведи на экран их сумму и произведение.
Каждое значение выводить с новой строки.

Пример вывода на экран для а = 5, b = 7:
12
35
 */
public class Task2_04 {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.printf("Cуммa -> %s \n", a + b);
        System.out.printf("Произведение -> %s \n", a * b);
    }
}
