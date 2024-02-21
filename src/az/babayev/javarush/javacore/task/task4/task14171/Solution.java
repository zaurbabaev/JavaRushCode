package az.babayev.javarush.javacore.task.task4.task14171;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan");
        Collections.addAll(ivan.allMoney,
                new Hryvnia(313), new USD(2000), new Ruble(5000));

        ivan.getAllMoney().forEach(money -> System.out.printf("%s имеет заначку в размере %.1f %s\n",
                ivan.name, money.getAmount(), money.getCurrencyName()));
    }

    static class Person {
        public String name;

        private final List<Money> allMoney;


        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }


    }
}
