package az.babayev.javarush.javacore.task.task3.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileName)));
            fileReader.lines()
                    .map(Integer::parseInt)
                    .filter(x -> x % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
