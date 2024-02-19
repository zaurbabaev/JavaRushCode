package az.babayev.javarush.javacore.task.task3.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream input = null;
        BufferedReader reader = null;
        try {
            input = new FileInputStream(scanner.nextLine());
            reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Something well wrong " + e);
        } finally {

            scanner.close();
            try {
                input.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
