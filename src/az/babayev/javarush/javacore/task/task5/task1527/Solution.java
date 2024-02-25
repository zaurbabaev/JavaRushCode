package az.babayev.javarush.javacore.task.task5.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

//a   b  c
//http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL(reader.readLine());
        String query = url.getQuery();
        String[] array1 = query.split("&");
        for (String s : array1) {
            String[] split = s.split("=.+");
            for (String string : split) {
                System.out.print(string + " ");
            }
        }

        for (String str : array1) {
            if (str.contains("obj")) {
                System.out.println();
                try {
                    alert(Double.parseDouble(str.substring(str.indexOf("=") + 1)));
                } catch (Exception e) {
                    alert(str.substring(str.indexOf("=") + 1));
                }
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
