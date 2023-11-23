package az.babayev.javarush.javasyntax.task.task02;

/*
Создай объект типа ToStringExample (кот), объект типа Dog (собака), объект типа Fish (рыбка)
и объект типа Woman.Присвой каждому животному владельца (owner).
 */
public class Task5_03 {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Cat cat = new Cat();
        cat.owner = woman;

        Dog dog = new Dog();
        dog.owner = woman;

        Fish fish = new Fish();
        fish.owner = woman;
    }

    public static class Woman {
    }

    public static class Cat {
        Woman owner;
    }

    public static class Dog {
        Woman owner;
    }

    public static class Fish {
        Woman owner;
    }


}
