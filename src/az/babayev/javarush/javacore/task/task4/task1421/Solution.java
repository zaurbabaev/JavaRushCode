package az.babayev.javarush.javacore.task.task4.task1421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        while (true) {
            key = reader.readLine();
            if (!(key.equalsIgnoreCase("user") || key.equalsIgnoreCase("loser")
                    || key.equalsIgnoreCase("coder") || key.equalsIgnoreCase("proger"))) {
                break;
            }
            person = switch (key) {
                case "user" -> new User();
                case "loser" -> new Loser();
                case "coder" -> new Coder();
                case "proger" -> new Proger();
                default -> person;
            };
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof User user) {
            user.live();
        } else if (person instanceof Loser loser) {
            loser.doNothing();
        } else if (person instanceof Coder coder) {
            coder.writeCode();
        } else if (person instanceof Proger proger) {
            proger.enjoy();
        }
    }
}
