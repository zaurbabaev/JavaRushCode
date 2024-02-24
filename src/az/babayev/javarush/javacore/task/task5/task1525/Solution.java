package az.babayev.javarush.javacore.task.task5.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
