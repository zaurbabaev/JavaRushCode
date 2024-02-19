package az.babayev.javarush.javacore.task.task3.task1319;


import java.io.*;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;
        try {
            String destination = reader.readLine();
            writer = new BufferedWriter(new FileWriter(destination));
            while (true) {
                String str = reader.readLine();
                writer.write(str + "\n");
                if (str.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
