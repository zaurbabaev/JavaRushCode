package az.babayev.javarush.javacore.task.task1.task1109;

/*
Скрой все внутренние переменные класса Cat и Dog.
Также скрой все методы, кроме тех, с помощью которых эти классы
взаимодействуют друг с другом.
 */
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);
        System.out.println(cat.isDogNear(dog));
        System.out.println(dog.isCatNear(cat));
    }
}
