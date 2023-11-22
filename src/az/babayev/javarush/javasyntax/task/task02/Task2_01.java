package az.babayev.javarush.javasyntax.task.task02;

/*
В классе Person объяви следующие переменные: name типа String,
 age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.

 */
public class Task2_01 {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name;
        int gae;
        int weight;
        int money;
    }
}
