package az.babayev.javarush.javacore.task.task3.task1319;

import java.io.*;

public class Solution2 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        ) {
            String str;
            do {
                str = reader.readLine();
                writer.write(str);
                writer.newLine();
            }
            while (!(str.equalsIgnoreCase("exit")));


        } catch (IOException e) {
            System.out.println("Something well wrong " + e);

        }
    }
}


