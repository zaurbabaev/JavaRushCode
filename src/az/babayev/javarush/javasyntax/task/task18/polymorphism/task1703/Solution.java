package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1703;

import java.util.ArrayList;
import java.util.Collections;

/*
Перед тем, как космический корабль отправится бороздить просторы Вселенной,
необходимо пригласить на борт экипаж, который будет состоять из 2 людей,
1 собаки и 1 кота.
В методе createCrew() добавь необходимое количество экземпляров соответствующих
классов в список astronauts.

Подсказка:
Чтобы добавить объекты разных классов в один список, им нужен общий предок.
Унаследуй интересующие тебя классы от Astronaut. Кто угодно может стать
исследователем космоса :)
 */
public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        creatCrew();
        printCrewInfo();
    }

    public static void creatCrew() {
        Astronaut human1 = new Human();
        Astronaut human2 = new Human();
        Astronaut dog = new Dog();
        Astronaut cat = new Cat();
//        astronauts = new ArrayList<>(List.of(
//                human1, human2, dog, cat
//        ));
        Collections.addAll(astronauts, human1, human2, dog, cat);
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }

}
