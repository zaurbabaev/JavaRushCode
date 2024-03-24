package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {
    public static List<String> waitingEmployees = new ArrayList<>();
    public static List<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void init() {
        waitingEmployees.add("Amigo");
        waitingEmployees.add("Nelli");
        waitingEmployees.add("Jack");
        waitingEmployees.add("Doctor");
        waitingEmployees.add("Risi");
        waitingEmployees.add("Sunak");
    }

    public static void paySalary(String name) {
        if (name != null && waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int personIndex = waitingEmployees.indexOf(name);
            waitingEmployees.set(personIndex, null);
        }
    }

    public static void print(List<String> list) {
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        init();
        print(waitingEmployees);
        paySalary("Amigo");
        print(alreadyGotSalaryEmployees);
        print(waitingEmployees);
        paySalary(null);
        print(alreadyGotSalaryEmployees);
        paySalary("Sunak");
        print(alreadyGotSalaryEmployees);
        print(waitingEmployees);
    }
}
