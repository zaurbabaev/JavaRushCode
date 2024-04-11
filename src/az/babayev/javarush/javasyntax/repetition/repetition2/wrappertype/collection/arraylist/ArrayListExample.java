package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    private static final List<String> waitingEmployees = new ArrayList<>();
    private static final List<String> alreadyGotSalaryEmployees = new ArrayList<>();

    private static void initEmployees() {
        Collections.addAll(waitingEmployees, "Amigo", "Risha", "John", "Diego", "Hans", "Kim", "Bilaabo");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees);
        paySalary("John");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    private static void paySalary(String name) {
        for (int i = 0; i < waitingEmployees.size(); i++) {
            if (name != null && waitingEmployees.contains(name)) {
                int indexOf = waitingEmployees.indexOf(name);
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(indexOf, null);
            }
        }
    }


}
