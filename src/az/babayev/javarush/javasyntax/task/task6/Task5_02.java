package az.babayev.javarush.javasyntax.task.task6;

/*
В каждом классе Cat и Dog написать метод finalize,
который выводит на экран текст о том, что такой-то объект уничтожен.
 */
public class Task5_02 {

    public static class Cat {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("A Cat was destroyed");
        }
    }

    public static class Dog{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("A Dog was destroyed");
        }
    }
}
