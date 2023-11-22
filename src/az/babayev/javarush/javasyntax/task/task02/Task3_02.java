package az.babayev.javarush.javasyntax.task.task02;

/*
Создать 3 объекта типа Dog (собака).
Сохрани каждый экземпляр в отдельную переменную.
Присвоить им имена "Max", "Bella", "Jack".
 */
public class Task3_02 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
