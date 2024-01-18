package az.babayev.javarush.javasyntax.task.task13;

import java.util.ArrayList;

/*
В классе Accounting есть список сотрудников waitingEmployees,
которые ждут зарплату, и список сотрудников alreadyGotSalaryEmployees,
которые её уже получили. Необходимо реализовать метод paySalary(String),
который в качестве аргумента принимает имя сотрудника, желающего получить зарплату.

Метод должен проверить наличие сотрудника в списке waitingEmployees,
и если он не получал зарплату, выдать её:

1)Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
2)Добавить имя сотрудника в список alreadyGotSalaryEmployees.
3)В списке waitingEmployees заменить имя сотрудника на null.
 */
public class Accounting {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Иногрим");
        paySalary("Боргелейф");
        paySalary("Нифрод");
        paySalary(null);
        System.out.println(alreadyGotSalaryEmployees);
        System.out.println(waitingEmployees);
    }

    public static void paySalary(String name) {
        if (name != null && waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
        }
    }
}
