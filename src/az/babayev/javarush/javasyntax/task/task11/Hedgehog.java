package az.babayev.javarush.javasyntax.task.task11;

/*
Наша задача — накормить ежика. Нужно в методе main создать один объект
Apple и один объект Hedgehog, у которого вызвать метод eat и
передать нужный аргумент — яблоко.
 */
public class Hedgehog {
    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
        //напишите тут ваш код
    }

    public static class Apple {

    }
}
