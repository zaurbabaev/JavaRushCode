package az.babayev.javarush.javacore.task.task4.task1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;
        while (!(key = reader.readLine()).equalsIgnoreCase("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }

            haveFun(person);
        }


    }

    public static void haveFun(Person person) {
        if (person instanceof Player player) {
            player.play();
        }
        if (person instanceof Dancer dancer) {
            dancer.dance();
        }
    }


}
