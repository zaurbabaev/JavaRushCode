package az.babayev.javarush.javacore.task.task3.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));// daxilinə faylın adını yazırıq
        ) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNext()) {
                int value = scanner.nextInt();
                if (value % 2 == 0) {
                    list.add(value);
                }
            }
            Collections.sort(list);
            list.forEach(System.out::println);
        }
    }
}
