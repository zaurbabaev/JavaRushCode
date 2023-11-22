package az.babayev.javarush.javasyntax.task.task01;

/*
Дана переменная number(она уже создана, к ней можно обращаться по имени
с любого места программы).Напиши программу, которая посчитает
квадрат числа переменной number и выведет его на экран
 */
public class Task3_04 {
    public static int number = 25;

    public static void main(String[] args) {
        System.out.printf("Kвадрат числа -> %d", number*number);

    }
}
