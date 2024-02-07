package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1705;

import java.util.ArrayList;
import java.util.Collections;

/*
Сделаем наш предыдущий пример более правильным и универсальным.
Порядок, в котором добавляются астронавты в список astronauts, не всегда будет
известен. Чтобы правильно распределить задачи членам экипажа, необходимо
определить, кем является астронавт. Для этого в методе runWorkingProcess()
перебери всех астронавтов в цикле, используя оператор instanceof определи,
кем является астронавт и передай его в качестве аргумента соответствующему методу:
Human — в метод pilot(Human human);
Dog — в метод createDirection(Dog dog);
Cat — в метод research(Cat cat).

Метод runWorkingProcess() должен работать корректно независимо от количества
астронавтов и порядка их добавления в astronauts.
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
            if (astronaut instanceof Human) {
                pilot((Human) astronaut);
            } else if (astronaut instanceof Dog) {
                createDirection((Dog) astronaut);
            } else if (astronaut instanceof Cat) {
                research((Cat) astronaut);
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
