package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1704;

import java.util.ArrayList;
import java.util.Collections;

/*
Все члены экипажа космического корабля находятся на борту, корабль успешно вышел
в открытый космос.
Команде пора приступить к выполнению своих обязанностей:
Людям — пилотировать корабль, Собаке — заниматься навигацией,
а Коту — исследовать открытый космос.

Распредели обязанности членов экипажа в методе runWorkingProcess().

Для этого достань из списка astronauts всех людей (ты знаешь,
под какими индексами они находятся) и передай их в качестве аргументов
методу pilot(Human human), собаку передай в метод createDirection(Dog dog),
а кота — в метод research(Cat cat).
Другие методы не изменяй.

Подсказка:
Список astronauts содержит объекты типа Astronaut. Чтобы вызвать методы pilot(),
createDirection() и research(), сначала объект Astronaut нужно привести к
правильному типу.
 */
public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        creatCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        astronauts.forEach(astronaut -> {
            if (astronaut instanceof Human human) {
                pilot(human);
            } else if (astronaut instanceof Dog dog) {
                createDirection(dog);
            } else if (astronaut instanceof Cat cat) {
                research(cat);
            }
        });
    }

    public static void pilot(Human human) {
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat) {
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void creatCrew() {
        Collections.addAll(astronauts, new Human(), new Human(), new Dog(), new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }

}
