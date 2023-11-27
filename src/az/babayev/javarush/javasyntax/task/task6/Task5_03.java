package az.babayev.javarush.javasyntax.task.task6;
/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 */
public class Task5_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {
            Dog dog = new Dog();
            Cat cat = new Cat();
        }

    }
    public static class Cat{
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Cat was destroyed");
        }

    }
    public static class Dog{
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Dog was destroyed");
        }
    }
}
