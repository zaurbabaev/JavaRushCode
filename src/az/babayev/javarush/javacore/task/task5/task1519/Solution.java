package az.babayev.javarush.javacore.task.task5.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String console = null;
        while (!(console = reader.readLine()).equals("exit")) {
            try {
                if (console.contains(".")) {
                    print(Double.parseDouble(console));
                } else if (Integer.parseInt(console) > 0 && Integer.parseInt(console) < 128) {
                    print(Short.parseShort(console));
                } else if (Integer.parseInt(console) <= 0 || Integer.parseInt(console) >= 128) {
                    print(Integer.parseInt(console));
                } else {
                    print(console);
                }
            } catch (NumberFormatException e) {
                print(console);
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
