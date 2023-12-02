package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */
public class Task6_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min = (a <= b && a <= c) ? a : (b <= c && b <= a) ? b : c;
        int max = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        int middle = (a + b + c) - (max + min);
        System.out.println(max + " " + middle + " " + min);

    }
}
