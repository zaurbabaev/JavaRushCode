package az.babayev.javarush.javasyntax.task.task01;

/*
Сложи 2 и 2 с помощью метода sum.

В этой программе уже написан код метода, который умеет считать сумму 2 чисел
и выводить её на экран. Всё, что тебе нужно сделать — написать вызов этого
метода с параметрами 2 и 2 в методе sum.
 */
public class Task8_04 {
    public static void main(String[] args) {
        sum(2, 2);
    }
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}
