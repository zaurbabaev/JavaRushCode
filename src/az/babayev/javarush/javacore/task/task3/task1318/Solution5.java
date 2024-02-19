package az.babayev.javarush.javacore.task.task3.task1318;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution5 {
    public static void main(String[] args) {


        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
                InputStream inputStream = new FileInputStream(reader.readLine());
                BufferedInputStream buffer = new BufferedInputStream(inputStream);
        ) {

            String path = reader.readLine();

            StringBuilder stringBuilder = new StringBuilder();

            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                if (c == '\n') {
                    System.out.println(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                } else {
                    stringBuilder.append(c);
                }
            }

            if (!stringBuilder.isEmpty()) {
                System.out.println(stringBuilder.toString());
            }

        } catch (Exception e) {
            System.out.println("Something well wrong " + e);
        }
    }
}
