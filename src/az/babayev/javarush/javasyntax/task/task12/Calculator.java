package az.babayev.javarush.javasyntax.task.task12;

/*
Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
Для этого создай внутренний статический (вложенный) класс Calculator2 и
перенеси в него методы add, subtract, multiply и divide.
Не забудь подкорректировать их вызовы.
 */
public class Calculator {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator2.add(a, b);
        Calculator2.subtract(a, b);
        Calculator2.multiply(a, b);
        Calculator2.divide(a, b);
    }

    public static class Calculator2 {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
