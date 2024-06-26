package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1707;

/*
Класс Pet является родительским классом для классов Cat и Dog.
В нем реализован метод printInfo(), который сообщает, что данный объект является
питомцем.
В классах Cat и Dog переопредели метод printInfo(), дополнив его функционал
следующим образом:

вначале вызови метод printInfo() родительского класса;
потом дополнительно выведи в консоли "Я не люблю людей" для класса Cat или
"Я люблю людей" для класса Dog.
Пример вывода для класса Cat:
Я домашний питомец.
Я не люблю людей.

Пример вывода для класса Dog:
Я домашний питомец.
Я люблю людей.
 */
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        dog.printInfo();
    }

}
