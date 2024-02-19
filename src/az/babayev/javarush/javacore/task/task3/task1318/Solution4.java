package az.babayev.javarush.javacore.task.task3.task1318;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileInputStream input = new FileInputStream(reader.readLine());
                BufferedInputStream buffer = new BufferedInputStream(input);
        ) {
            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                System.out.print(c);
            }
        } catch (Exception e) {
            System.out.println("Something well wrong " + e);
        }
    }
}

