package az.babayev.javarush.javacore.task.task5.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {

        String input;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            while (!(input = reader.readLine()).equals("exit")) {
                try {
                    if (input.contains(".")) {
                        print(Double.parseDouble(input));
                    } else {
                        int n = Integer.parseInt(input); // bu hissədə biz artıq stringi intə çevirmişik
                        // string yazaq NumberFormatException atacaq ona görə bu exceptionu tutub catch daxilində artıq print(String) yazırıq və parametrinə öncədən elan etdiyimiz String inputu veririk
                        if (n > 0 && n < 128) {
                            print((short) n);
                        } else {
                            print(n);
                        }
                    }
                } catch (Exception e) {
                    print(input);
                }
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
