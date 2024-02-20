package az.babayev.javarush.javacore.task.task4.task1404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (!(key = reader.readLine()).isEmpty()) {
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat);
        }
    }
}

