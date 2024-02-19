package az.babayev.javarush.javacore.task.task3.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader
                    (new FileInputStream(scanner.nextLine())))) {
                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }
            }
        } catch (IOException e) {
            System.out.println("Something well wrong " + e);
        }
    }

}
